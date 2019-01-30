package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChannelInboxPage {
    public ChannelInboxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"/web#menu_id=199&action=\"]")
    public WebElement invoicingLink;


    @FindBy(xpath = "//li[.=\"#Inbox\"]")
    public WebElement hasTagInbox;

    public void navigateToInvoicing(){
        invoicingLink.click();
    }
}
