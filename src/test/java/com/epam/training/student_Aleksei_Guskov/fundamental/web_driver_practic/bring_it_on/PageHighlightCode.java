package com.epam.training.student_Aleksei_Guskov.fundamental.web_driver_practic.bring_it_on;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageHighlightCode {
    private static final String URL_HIGHLIGHT_CODE = "https://highlight.hohli.com/";
    private final WebDriver driver;
    @FindBy(
            xpath = "//select[@id='inputLanguage']//option[@value='bash']"
    )
    private WebElement selectInputLanguageBash;
    @FindBy(
            xpath = "//input[@id='lineNumbers']"
    )
    private WebElement selectOptionLineNumbers;
    @FindBy (
            xpath = "//input[@type='submit']"
    )
    private WebElement submitButton;
    @FindBy(
            xpath = "//textarea[@id='inputCode']"
    )
    private WebElement textArea;
    public PageHighlightCode(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public PageHighlightCode openPage() {
        this.driver.get(URL_HIGHLIGHT_CODE);
        WebDriverWait webDriverWait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        return this;
    }
    public void selectorOptionsLineNumbersAndLanguage() {
        this.selectInputLanguageBash.click();
        this.selectOptionLineNumbers.click();
        this.submitButton.click();
    }
    public PageHighlightCode pasteTextInArea(String textForArea) {
        this.textArea.sendKeys(textForArea);
        return new PageHighlightCode(this.driver);
    }
}