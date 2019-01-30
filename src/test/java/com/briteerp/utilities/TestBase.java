package com.briteerp.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected static WebDriver driver;
    protected Actions actions;
    protected SoftAssert softAssert;

    @BeforeClass
    public void setUpClass() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        softAssert = new SoftAssert();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void setDownMethod(){
        Driver.closeDriver();
        softAssert.assertAll();
    }


}