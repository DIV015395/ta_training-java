package com.epam.training.student_Aleksei_Guskov.fundamental.web_driver_practic.hardcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageWhitEstimate {
    private WebDriver driver;
    @FindBy (xpath = "//h2[text()='Estimate']")
    private WebElement estimateHeadAfterCalculation;
    public PageWhitEstimate(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public PageWhitEstimate examEstimateOnly() {
        WebDriverWait webDriverWait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        webDriverWait.until(webDriver -> estimateHeadAfterCalculation.isDisplayed());
        return this;
    }
}
