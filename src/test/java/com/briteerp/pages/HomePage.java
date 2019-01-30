package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateToHomePage(){
        Driver.getDriver().get("http://52.39.162.23/");
    }

    public void navigateToLoginPage(){
        briteErpDemoLink.click();
    }

    @FindBy(xpath = "//a[@href=\"/web?db=BriteErpDemo\"]")
    public WebElement briteErpDemoLink;
}
