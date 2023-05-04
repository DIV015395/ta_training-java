package com.epam.training.student_Aleksei_Guskov.web_driver_practic.hardcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PasteForTheThirdExercise {
    private WebDriver driver;

    private static final String SEARCHING_TEXT= "Google Cloud Platform Pricing Calculator";
    private static final String NUMBER_OF_INSTANCES = "4";
    private static final String PROVISIONING_MODEL = "Provisioning model: Regular";
    private static final String INSTANCE_TYPE = "Instance type: n1-standard-8\n" +
            "Committed Use Discount applied";
    private static final String REGION = "Region: Frankfurt";
    private static final String LOCAL_SSD = "Local SSD: 2x375 GiB\n" +
            "Committed Use Discount applied";
    private static final String COMMITMENT_TERM = "Commitment term: 1 Year";
    private static final String TOTAL_ESTIMATED = "1,840.40";
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
    public void createNewPlatform() throws InterruptedException {
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
    public void testEqualsSelectedParametersWithConstantParameters() throws InterruptedException {
        createNewPlatform();
        PageWhitEstimate pageWhitEstimate= new PageWhitEstimate(this.driver).examEstimateOnly();
        softAssert.assertEquals(pageWhitEstimate.getTextFromProvisioningModel(),
                PROVISIONING_MODEL, "Provisioning model is not Regular!");
        softAssert.assertEquals(pageWhitEstimate.getTextFromInstanceType(),
                INSTANCE_TYPE, "Instance type is not n1-standard-8!");
        softAssert.assertEquals(
                pageWhitEstimate.getTextFromRegion(),
                REGION, "Region is not Frankfurt!");
        softAssert.assertEquals(pageWhitEstimate.getTextFromLocalSSD(),
                LOCAL_SSD, "Local SSD is not 2x375 GiB!");
        softAssert.assertEquals(pageWhitEstimate.getTextFromCommitmentTerm(),
                COMMITMENT_TERM, "Commitment term is not 1 Year!");
        softAssert.assertEquals(pageWhitEstimate.getTexFromTotalEstimated(),
                TOTAL_ESTIMATED, "Total estimated is not equaled!!!");
        softAssert.assertAll();
    }
    public void sendEmailOnTemporaryMail() throws InterruptedException {
        createNewPlatform();
        PageWhitEmailGenerator pageWhitEmailGenerator = new PageWhitEmailGenerator(this.driver)
                .openNewPage()
                .generationNewEmail()
                .returnToTheGooglePage()
                .onGooglePageClickEmailEstimate()
                .sendEmailAndGoToYopmailPage()
                .checkTheMailButtonClick();
    }
    @Test
    public void testOfEqualsPriceInMailAndInGoogle() throws InterruptedException {
        sendEmailOnTemporaryMail();
        PageWhitEmailGenerator pageWhitEmailGenerator = new PageWhitEmailGenerator(this.driver);
        String priceFromMail = pageWhitEmailGenerator.getTextFromEmail();
        pageWhitEmailGenerator.returnToTheGooglePage();
        String priceFromGooglePage = pageWhitEmailGenerator.getTexFromTotalEstimated();
        Assert.assertEquals(priceFromMail, priceFromGooglePage);

    }
    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        this.driver.quit();
        this.driver = null;
    }

}
