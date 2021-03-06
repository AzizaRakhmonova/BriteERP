package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement emailInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    public WebElement loginBtn;

    public void login(String email, String password){
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password);
        loginBtn.click();
    }
}
