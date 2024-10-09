package com.gsp.ui;

import com.gsp.driver.drivers.Driver;
import com.gsp.driver.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UI_LoginPage extends BaseTest {
    @Test
    public void authorizationTest() throws InterruptedException {

        LoginPage mainPageTravelHub = new LoginPage(Driver.getDriver());
        mainPageTravelHub.clickOnSignInButton();
        Thread.sleep(5000);
        boolean actual = mainPageTravelHub.isAuthorizationFormOpened();
        boolean expected = true;
        mainPageTravelHub.enterCorrectFieldsAuthorizationForm();
        Assertions.assertEquals(expected, actual);

    }

   @Test
    public void tourOrderCheck() throws InterruptedException{


   }
}
