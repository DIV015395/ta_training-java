package com.epam.training.student_Aleksei_Guskov.fundamental.web_driver_practic.hardcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PasteForTheThirdExercise {
    private WebDriver driver;

    private static final String SEARCHING_TEXT= "Google Cloud Platform Pricing Calculator";
    private static final String NUMBER_OF_INSTANCES = "4";
    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        this.driver = new ChromeDriver();
    }
    SoftAssert softAssert = new SoftAssert();
    public void openGoogleAndFindTheDesiredResult() {
        new PageGoogleCloudPlatform(this.driver)
                .openPage()
                .inputSearchTextInSearchArea(SEARCHING_TEXT)
                .imitationPressEnter()
                .selectSearchResult();
    }
    public void createNewPlatform() {
        openGoogleAndFindTheDesiredResult();
        new PageGooglePlatformCalculator(this.driver)
                .searchComputeEngineOption()
                .inputNumberOfInstances(NUMBER_OF_INSTANCES)
                .selectFreeOperatingSystem()
                .selectRegularProvisioningModel()
                .selectNOneSeries()
                .selectMachineType()
                .addGPUsOperations()
                .selectLocalSSD()
                .selectRegionOption()
                .selectCommittedUsageOptionAndAddToEstimate();
    }
    @Test
    public void test() {
        createNewPlatform();
        PageWhitEstimate pageWhitEstimate= new PageWhitEstimate(this.driver).examEstimateOnly();
    }
    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        this.driver.quit();
        this.driver = null;
    }

}
