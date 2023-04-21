package com.epam.training.student_Aleksei_Guskov.fundamental.web_driver_practic.bring_it_on;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PasteForTheSecondExercise {
    private WebDriver driver;
    private static final String TEXT_FOR_AREA = "git config --global user.name  \"New Sheriff in Town\" \n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\") \n" +
            "git push origin master --force";
    @BeforeMethod(
            alwaysRun = true
    )
    public void browserSetup() {
        this.driver = new ChromeDriver();
    }
    @Test
    public void pasteAndExamTextInAreaEqualsOfPattern() throws InterruptedException {
        Assert.assertEquals(
                pasteTextInTextAreaAndSelectLanguageOption().getTextFromPreviewArea(),
                TEXT_FOR_AREA);
    }
    @Test
    public void pasteAndExamSelectOfBashLanguageOption() throws InterruptedException {
        Assert.assertEquals(
                pasteTextInTextAreaAndSelectLanguageOption().getValueSelectedLanguage(),
                "bash");
    }
    @Test
    public void pasteAndExamSelectCheckBoxUseFontTag() throws InterruptedException {
        Assert.assertTrue(
                pasteTextInTextAreaAndSelectLanguageOption().checkBoxUseFrontTagChecking());
    }
    public PageHighlightCode pasteTextInTextAreaAndSelectLanguageOption() throws InterruptedException {
        PageHighlightCode pageHighlightCode = new PageHighlightCode(this.driver).openPage()
                .pasteTextInArea(TEXT_FOR_AREA)
                .selectorOptionsFontTagAndLanguage();
        Thread.sleep(500);
        return pageHighlightCode;
    }
    @AfterMethod(
            alwaysRun = true
    )
    public void browserTearDown() {
        this.driver.quit();
        this.driver = null;
    }
}