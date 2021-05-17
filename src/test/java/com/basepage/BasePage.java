package com.basepage;

import org.openqa.selenium.WebDriver;

import com.driver.Setup;
import com.driver.Wait;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
