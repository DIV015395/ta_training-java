package com.epam.training.student_Aleksei_Guskov.fundamental.web_driver_practic.hardcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageGooglePlatformCalculator {
    private WebDriver driver;
    @FindBy (css = "#tab-item-1 > div.tab-holder.compute.estimated")
    private WebElement computeEngine;
    @FindBy (xpath = "//input[@id='input_95']")
    private WebElement areaNumberOfInstances;

    public PageGooglePlatformCalculator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public PageGooglePlatformCalculator inputNumberOfInstances() {
        WebDriverWait webDriverWait = new WebDriverWait(this.driver, Duration.ofSeconds(500));
        webDriverWait.until(webDriver -> computeEngine.isDisplayed());
        this.computeEngine.click();
        return this;
    }

}
