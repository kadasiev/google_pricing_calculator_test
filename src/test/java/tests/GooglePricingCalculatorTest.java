package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleCloudMainPage;
import pages.GoogleCloudPricingCalculatorPage;
import pages.YOPMailMainPage;
import util.BrowserTabsManager;

public class GooglePricingCalculatorTest extends BaseTest{
    @Test(description = "Verify that the estimate price sent by email from Google calculator is correct")
    public void verifyTheEstimatePriceSentByEmail() {
        String estimateMonthlyCostFromGoogleCalculator = new GoogleCloudMainPage()
                .openPage()
                .searchInGoogleCloud("Google Cloud Platform Pricing Calculator")
                .openPricingCalculator()
                .enterNumberOfInstances("4")
                .selectN1Series()
                .selectCPU8RUM30Machine()
                .selectAddGPUCheckbox()
                .selectNvidia_tesla_v100GPUType()
                .selectOneGPU()
                .selectSSD2x375GB()
                .selectDatacenterLocationFrankfurt()
                .selectOneYearCommittedOption()
                .clickAddToEstimateButton()
                .getTotalEstimateMonthlyCost();

        BrowserTabsManager.switchToYOPMailTab();
        YOPMailMainPage yopMailMainPage = new YOPMailMainPage();
        String email = yopMailMainPage
                .openPage()
                .generateNewEmailAddress()
                .getGeneratedEmailAddress();

        BrowserTabsManager.switchToGooglePricingTab();
        new GoogleCloudPricingCalculatorPage()
                .emailEstimateTo(email);

        BrowserTabsManager.switchToYOPMailTab();
        String estimateMonthlyCostFromEmail = yopMailMainPage.openPage()
                .openYOPMailBox()
                .getEstimateMonthlyCostFromEmail();

        Assert.assertEquals(estimateMonthlyCostFromEmail,
                estimateMonthlyCostFromGoogleCalculator + "c", "Verification of the estimate price sent by email from Google calculator");
    }

}
