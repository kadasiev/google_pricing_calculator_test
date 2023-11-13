package tests;

import model.VirtualMachine;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleCloudPricingCalculatorPage;
import pages.YOPMailMainPage;
import util.BrowserTabsManager;
import util.VirtualMachineCreator;

public class GooglePricingCalculatorTest extends BaseTest{
    @Test(description = "Verify that the estimate price sent by email from Google calculator is correct")
    public void verifyTheEstimatePriceSentByEmail() {
        VirtualMachine virtualMachine = VirtualMachineCreator.creatVirtualMachine();

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
                virtualMachine.getPrice(),
                "Verification of the estimate price sent by email from Google calculator");
    }
}
