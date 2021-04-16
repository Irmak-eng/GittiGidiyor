package org.example.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.function.Function;
public class BasePage {
    WebDriver driver;
    Actions action;

    WebDriverWait wait;
    public BasePage(WebDriver driver) {
        this.driver = driver;

        this.wait = new WebDriverWait(driver, 10, 400);
    }
    public WebElement findElement(By by) {

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void clickElement(By by) {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
    }
    public void sendKeys(By by, CharSequence text) {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(text);
    }
    public String getText(By by) {

        return findElement(by).getText();
    }
    public String getHeader(){
        return driver.getTitle();
    }
    public void moveToElement(By by) {
        WebElement element = findElement(by);
        action.moveToElement(element).perform();

    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void scrollDown(By by){
        WebElement element = findElement(by);
        element.sendKeys(Keys.CONTROL, Keys.END);
    }
    public void scroll(By by){
        WebElement element = findElement(by);
        element.sendKeys(Keys.SPACE);
    }


    }


