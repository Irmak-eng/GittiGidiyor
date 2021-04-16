package org.example.page;

import org.example.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.example.constants.ConstantLoginPage.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {

        super(driver);
    }
    public void MainPageControl() throws InterruptedException {
        Assert.assertEquals("Anasayfaya Ulaşılamadı",
                "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",getHeader());
          //test2
        clickElement(MOUSEOVER);
        clickElement(GIRISYAP);
        sendKeys(EMAIL,"otluirmak97@gmail.com");
        sendKeys(PASSWORD,"Irmak0697");
        clickElement(LOGINBTN);
        Assert.assertEquals("Giriş Başarısız","Sepetim",getText(VALUE));
        /* test3 */
        clickElement(SEARCHBAR);
        sendKeys(SEARCHBAR,"bilgisayar");
        clickElement(SEARCHBTN);
        TimeUnit.SECONDS.sleep(5);
        scrollDown(BODY);
        TimeUnit.SECONDS.sleep(5);
        clickElement(PAGE2);
        Assert.assertEquals(
                "2. sayfada değilsiniz.",
                "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2",
                getUrl()
        );
        // test4
        clickElement(PICK);
        TimeUnit.SECONDS.sleep(5);
        String ilkFiyat = getText(PRICE);
        System.out.println("fiyat alındı");
        TimeUnit.SECONDS.sleep(5);
        scrollDown(BODY);
        TimeUnit.SECONDS.sleep(5);
        clickElement(ADD);
        System.out.println("ürün eklendi");

        clickElement(BASKET);
        Assert.assertEquals("Fiyat Değerleri Farklı",ilkFiyat,getText(FINALPRICE));
        //TEST5
        clickElement(DROPBAR);
        clickElement(AMOUNT);
        Assert.assertEquals("Ürün adedi 2 değil.","2",getText(AMOUNT));
        //TEST6
        clickElement(DELETE);
        TimeUnit.SECONDS.sleep(5);
        Assert.assertEquals(
                "Sepetiniz boş değil",
                "Sepetinizde ürün bulunmamaktadır.",
                getText(NOTIFICATION));
        TimeUnit.SECONDS.sleep(5);
    }
    public void LoginControl(){
    }
    public void PageTwoControl(){
    }
}
