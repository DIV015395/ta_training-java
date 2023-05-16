package com.epam.training.student_Manjeet.web_driver_practic.bring_it_on;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void pasteAndStartCaseOfExamOnTextAreaAndSelectOptionBashAndUseFontTag() throws InterruptedException {
        PageHighlightCode pageHighlightCode = new PageHighlightCode(this.driver).openPage()
                .pasteTextInArea(TEXT_FOR_AREA)
                .selectorOptionsFontTagAndLanguage();
        softAssert.assertEquals(
                pageHighlightCode.getTextFromPreviewArea(),
                TEXT_FOR_AREA, "Not equals text in area and paste text!");
        softAssert.assertEquals(
                pageHighlightCode.getValueSelectedLanguage(),
                "bash", "Not select language option \"bush\"!");
        softAssert.assertTrue(
                pageHighlightCode.checkBoxUseFrontTagChecking(), "Not select option \"Use Font Tag\"!");
        softAssert.assertAll();
    }
    @AfterMethod(
            alwaysRun = true
    )
    public void browserTearDown() {
        this.driver.quit();
        this.driver = null;
    }
}