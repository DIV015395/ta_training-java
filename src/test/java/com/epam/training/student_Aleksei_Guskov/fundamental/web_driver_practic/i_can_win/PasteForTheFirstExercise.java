package com.epam.training.student_Aleksei_Guskov.fundamental.web_driver_practic.i_can_win;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        new PageControlC(this.driver).openPage()
                .pasteTextInArea("Hello from WebDrive")
                .pasteTextInTitle("helloweb")
                .selectorHighlightingOptionChoice();
        Thread.sleep(4000);
    }
    @AfterMethod(
            alwaysRun = true
    )
    public void browserTearDown() {
        this.driver.quit();
        this.driver = null;
    }
}
