package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicingPage {
    public InvoicingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"/web#menu_id=213&action=\"]")
    public WebElement reportingManagementLink;

    @FindBy(xpath = "//a[@href=\"/web#menu_id=248&action=328\"]")
    public WebElement invoicesLink;

    public void goToInvoices(){
        reportingManagementLink.click();
        invoicesLink.click();
    }

}
