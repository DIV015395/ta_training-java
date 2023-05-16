package com.epam.training.student_Manjeet.framework_practic.test;

import com.epam.training.student_Manjeet.framework_practic.page.PageWhitEmailGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePlatformPriceEqualsPriceInEmailTest extends CommonConditions{

    @Test
    public void testOfEqualsPriceInMailAndInGoogle() throws InterruptedException {
        sendEmailOnTemporaryMail();
        PageWhitEmailGenerator pageWhitEmailGenerator = new PageWhitEmailGenerator(this.driver);
        String priceFromMail = pageWhitEmailGenerator.getTextFromEmail();
        pageWhitEmailGenerator.returnToTheGooglePage();
        String priceFromGooglePage = pageWhitEmailGenerator.getTexFromTotalEstimated();
        Assert.assertEquals(priceFromMail, priceFromGooglePage);
    }
}
