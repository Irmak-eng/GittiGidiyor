package org.example.test;

import org.example.base.BaseTest;
import org.example.page.LoginPage;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    @Before
    public void before() {
        loginPage = new LoginPage(driver);
        driver.get("https://www.gittigidiyor.com/");
    }


    @Test
    public void loginTest() throws InterruptedException {
        loginPage.MainPageControl();
        TimeUnit.SECONDS.sleep(5);
    }


}
