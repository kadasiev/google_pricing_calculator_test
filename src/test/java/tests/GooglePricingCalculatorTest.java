package tests;

import static driver.Driver.openPage;
import static driver.Driver.openPageAndGetTabId;
import static driver.Driver.openPageInNewTabAndGetTabId;
import static driver.Driver.switchToTab;
import static util.VirtualMachineCreator.creatVirtualMachine;

import model.VirtualMachine;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePricingCalculatorTest extends BaseTest {

    static final String GOOGLE_BASE_URL = "https://cloud.google.com/";
    static final String YOP_MAIL_BASE_URL = "https://yopmail.com/";
    private static String googlePricingTab;
    private static String yopMailTab;

    @Test(description = "Verify that the estimate price sent by email from Google calculator is correct")
    public void verifyTheEstimatePriceSentByEmail() {
        googlePricingTab = openPageAndGetTabId(GOOGLE_BASE_URL);
        pricingCalculatorSteps
            .searchInGoogleCloud("Google Cloud Platform Pricing Calculator");
        VirtualMachine virtualMachine = creatVirtualMachine();
        yopMailTab = openPageInNewTabAndGetTabId(YOP_MAIL_BASE_URL);
        String email = yopMailSteps.getNewMailAddress();
        switchToTab(googlePricingTab);
        pricingCalculatorSteps.emailEstimateTo(email);
        switchToTab(yopMailTab);
        openPage(YOP_MAIL_BASE_URL);
        String estimateMonthlyCostFromEmail = yopMailSteps
            .getEstimateMonthlyCostFromEmail();

        Assert.assertEquals(estimateMonthlyCostFromEmail + 1,
                virtualMachine.getPrice(),
                "Estimate price from email is not correct!");
    }
}
