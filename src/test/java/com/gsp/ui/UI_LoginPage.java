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
        Thread.sleep(5000);
        mainPageTravelHub.enterCorrectFieldsAuthorizationForm();
        Assertions.assertEquals(expected, actual);
        boolean actualPersonalPage = mainPageTravelHub.isPersonalAccountPageOpened();
        boolean expectedPersonalPage = true;
        Assertions.assertEquals(expectedPersonalPage, actualPersonalPage);
        Thread.sleep(5000);

    }

   @Test
    public void tourOrderCheck() throws InterruptedException{
       authorizationTest();
       LoginPage mainPageTravelHub = new LoginPage(Driver.getDriver());
       boolean actual = mainPageTravelHub.isPersonalAccountPageOpened();
       boolean expected = true;
       Assertions.assertEquals(expected, actual);
       Thread.sleep(5000);
       mainPageTravelHub.orderTourFromServiceOrderCart();

       Thread.sleep(5000);


   }

}
