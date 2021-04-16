package org.example.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public WebDriver driver;

    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        //options.addArguments("headless");

        // Driver oluşturma ve ayarlarını yükleme
        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
