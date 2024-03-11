package com.travelHub.ui;

import com.travelHub.driver.drivers.Driver;
import com.travelHub.driver.pages.LoginPage;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UI_LoginPage extends BaseTest {
    protected static final Logger logger = Logger.getLogger(UI_LoginPage.class.getName());
    @Test
    public void aouthorizationtest() throws InterruptedException {

        LoginPage mainPageTravelHub = new LoginPage(Driver.getDriver());
        mainPageTravelHub.clickLinkPersonalCabinet();
        Thread.sleep(5000);
        boolean actual = mainPageTravelHub.isAuthorizationFormOpened();
        boolean expected = true;
//        mainPageTravelHub.enterCorrectFieldsAuthorizationForm();
//        Assertions.assertEquals(expected, actual);
//        logger.info("nlbAouthorizationtest passed with the result " );

    }
}
