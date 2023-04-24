package com.epam.training.student_Aleksei_Guskov.fundamental.web_driver_practic.i_can_win;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PasteForTheFirstExercise {
    private WebDriver driver;
    @BeforeMethod(
            alwaysRun = true
    )
    public void browserSetup() {
        this.driver = new ChromeDriver();
    }
    @Test
    public void pasteTextInTitleAndAreaAndChoiceHighlighting () throws InterruptedException {
        PageControlC pageControlC = new PageControlC(this.driver).openPage()
                .pasteTextInArea("Hello from WebDriver")
                .pasteTextInTitle("helloweb")
                .selectorHighlightingOptionChoice();
//        Thread.sleep(500);
        Assert.assertEquals(pageControlC.getTextFromTextArea(), "Hello from WebDriver");
    }
    @AfterMethod(
            alwaysRun = true
    )
    public void browserTearDown() {
        this.driver.quit();
        this.driver = null;
    }
}
