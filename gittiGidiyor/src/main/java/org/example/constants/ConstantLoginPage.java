package org.example.constants;

import org.openqa.selenium.By;

public class ConstantLoginPage {

    public static final By MOUSEOVER = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[1]/div[2]");
    public static final By GIRISYAP = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a");
    public static final By EMAIL = By.id("L-UserNameField") ;
    public static final By PASSWORD = By.id("L-PasswordField");
    public static final By LOGINBTN = By.id("gg-login-enter");
    public static final By SEARCHBAR = By.name("k");
    public static final By SEARCHBTN = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button");
    public static final By PAGE2 = By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a");
    public static final By BODY = By.cssSelector("body");
    public static final By PICK = By.xpath("//ul[@class=\"catalog-view clearfix products-container\"]/li[2]");
    public static final By ADD = By.id("sp-addbasket-button");
    public static final By PRICE = By.id("sp-price-discountPrice");
    public static final By BASKET = By.xpath("//a[@class=\"gg-ui-btn-default padding-none\"]");
    public static final By FINALPRICE = By.xpath("//p[@class=\"new-price\"]");
    public static final By DROPBAR = By.xpath("//div[@class=\"gg-input gg-input-select \"]");
    public static final By AMOUNT = By.xpath("//option[@value=\"2\"]");
    public static final By DELETE = By.xpath("//a[@class=\"btn-delete btn-update-item\"]");
    public static final By NOTIFICATION = By.xpath("//h2");







    public static final By VALUE = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[2]/a/div/div[2]");
}
