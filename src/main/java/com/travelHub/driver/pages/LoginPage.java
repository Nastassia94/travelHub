package com.travelHub.driver.pages;

import com.travelHub.driver.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    // Login Page
    public String singInButtonOnMainPage = "//a[contains(@class, 'header-login')]";
    public String singInPage = "//h3[contains(@class, 'font-weight-bolder text-dark font-size-h4 font-size-h1-lg')][contains(text(), 'Личный кабинет TravelHub')]";
    public String formEmail = "//input[contains(@name, 'LoginForm[username]')]";
    public String formPassword = "//input [contains(@name, 'LoginForm[password]')]";
    public String buttonSingInOnLoginPage = "//button[contains(@class, 'btn submit-btn')][contains(text(), 'Войти')]";

    public String personalAccountPage = "//div[contains(text(), 'Привет,')]";


    // Tour Selection Page

    public String fieldDepartureCountry = "//span[contains(@class, 'select2-selection__rendered')][contains (text(), 'Минск')]";

    public String selectDepartureCountry = "//li[contains(@class, 'select2-results__option')][contains (text(), 'Москва')]";

    public String searchButton = "//button[@class = 'btn btn-primary search-btn'][contains (text(), 'Поиск')]";

    public String selectFirstTour = "//a[@class = 'btn btn-primary search-variants']";

    public String selectAccommodationOption = "//a[@class = 'btn btn-primary font-weight-bolder px-4 py-2']";

    // Basket of tours Page


    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = Driver.getDriver();
        this.driver.get("https://travelhub.by/");
    }
    public WebDriver getDriver() {
        return driver;
    }

    public void clickOnSignInButton() {
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

    public void enterCorrectFieldsAuthorizationForm() throws InterruptedException {
        By authorizationFormEmailBy = By.xpath(formEmail);
        WebElement authorizationFormEmailElement = driver.findElement(authorizationFormEmailBy);
        authorizationFormEmailElement.sendKeys("test.agent@internet.ru");
        By authorizationFormPasswordBy = By.xpath(formPassword);
        WebElement authorizationFormPasswordElement = driver.findElement(authorizationFormPasswordBy);
        authorizationFormPasswordElement.sendKeys("Asd94Lkj26");
        By authorizationFormEnterButtonBy = By.xpath(buttonSingInOnLoginPage);
        WebElement authorizationFormEnterButtonElement = driver.findElement(authorizationFormEnterButtonBy);
        authorizationFormEnterButtonElement.click();


    }

    public boolean isPersonalAccountPageOpened() {
        boolean isFormOpened = false;
        By personalAccountPageOpenedBy = By.xpath(personalAccountPage);
        WebElement personalAccountPageElement = driver.findElement(personalAccountPageOpenedBy);

        if (personalAccountPageElement.isDisplayed()) {
            isFormOpened = true;
        } else {
            isFormOpened = false;
        }
        return isFormOpened;
    }

   public void orderTourFromServiceOrderCart(){

       By selectCountryOfDepartureBy = By.xpath(fieldDepartureCountry);
       WebElement selectCountryOfDepartureElement = driver.findElement(selectCountryOfDepartureBy);
       selectCountryOfDepartureElement.click();
   }
}
