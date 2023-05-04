package com.epam.training.student_Aleksei_Guskov.web_driver_practic.bring_it_on;

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
            xpath = "//input[@id='fontTag']"
    )
    private WebElement selectOptionFontTag;
    @FindBy (
            xpath = "//input[@type='submit']"
    )
    private WebElement submitButton;
    @FindBy(
            xpath = "//textarea[@id='inputCode']"
    )
    private WebElement textArea;
    @FindBy (
            xpath = "//div[@id='preview']/blockquote"
    )
    private WebElement previewArea;
    @FindBy(
            xpath = "//input[@id='fontTag'][@checked]"
    )
    private WebElement checkBoxFrontTag;
    public PageHighlightCode(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public PageHighlightCode openPage() {
        this.driver.get(URL_HIGHLIGHT_CODE);
        WebDriverWait webDriverWait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        webDriverWait.until(webDriver -> textArea.isEnabled());
        return this;
    }
    public PageHighlightCode selectorOptionsFontTagAndLanguage() {
        this.selectInputLanguageBash.click();
        this.selectOptionFontTag.click();
        this.submitButton.click();
        return this;
    }
    public PageHighlightCode pasteTextInArea(String textForArea) {
        this.textArea.sendKeys(textForArea);
        return new PageHighlightCode(this.driver);
    }
    public String getTextFromPreviewArea() {
        return this.previewArea.getText();
    }
    public String getValueSelectedLanguage() {
        return this.selectInputLanguageBash.getAttribute("value");
    }
    public boolean checkBoxUseFrontTagChecking() {
        return this.checkBoxFrontTag.isEnabled();
    }
}