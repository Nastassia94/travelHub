package com.travelHub.driver.pages;

import com.travelHub.driver.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    public String singInButtonOnMainPage = "//a[contains(@class, 'header-login')]";
    public String singInPage = "//h3[contains(@class, 'font-weight-bolder text-dark font-size-h4 font-size-h1-lg')][contains(text(), 'Личный кабинет TravelHub')]";

    public String formEmail = "//input[contains(@name, 'LoginForm[username]')]";

    public String formPassword = "//input[contains(@name, 'LoginForm[username]')]";

    public String buttonSingInOnLoginPage = "//button[contains(@class, 'btn submit-btn')][contains(text(), 'Войти')]";

    public LoginPage(WebDriver driver) {
        this.driver = Driver.getDriver();
        this.driver.get("https://travelhub.by/");
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clickLinkPersonalCabinet() {
        By loginPageBy = By.xpath(singInButtonOnMainPage);
        WebElement mainPageElement = driver.findElement(loginPageBy);
        mainPageElement.click();
    }

    public boolean isAuthorizationFormOpened() {
        boolean isFormOpened = false;
        By singInPageOpenedBy = By.xpath(singInPage);
        WebElement singInPageElement = driver.findElement(singInPageOpenedBy);

        if (singInPageElement.isDisplayed()) {
            isFormOpened = true;
        } else {
            isFormOpened = false;
        }
        return isFormOpened;
    }

}
