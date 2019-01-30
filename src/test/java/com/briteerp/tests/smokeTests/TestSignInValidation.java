package com.briteerp.tests.smokeTests;

import com.briteerp.pages.ChannelInboxPage;
import com.briteerp.pages.HomePage;
import com.briteerp.pages.InvoicingPage;
import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.PageUtilities;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestSignInValidation extends TestBase {
    @Test
    public void testSignInValidation(){
        HomePage homePage = new HomePage();
        homePage.navigateToHomePage();
        homePage.navigateToLoginPage();

        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

        ChannelInboxPage channelInboxPage = new ChannelInboxPage();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(channelInboxPage.hasTagInbox));
        channelInboxPage.navigateToInvoicing();

        InvoicingPage invoicingPage = new InvoicingPage();
        wait.until(ExpectedConditions.elementToBeClickable(invoicingPage.reportingManagementLink));
        invoicingPage.goToInvoices();

    }
}
