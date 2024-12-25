package pages;

import static driver.Driver.switchToDefaultContent;
import static element.Element.xpath;

import element.Element;

public class GoogleCloudPricingCalculatorPage {

    Element googleIframe = xpath("//article[@id='cloud-site']/devsite-iframe/iframe");
    Element cloudPricingIframe = xpath("//iframe[@id='myFrame']");
    Element numberOfInstancesField = xpath("//input[@aria-label='quantity']");
    Element seriesField = xpath("//md-select[@placeholder='Series']");
    Element n1SeriesOption = xpath("//md-option[@id='select_option_223']");
    Element machineTypeField = xpath("//md-select[@placeholder='Instance type']");
    Element n1_standard_8Option = xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
    Element addGPUCheckbox = xpath("//md-checkbox[@aria-label='Add GPUs']");
    Element gpuTypeField = xpath("//md-select[@placeholder='GPU type']");
    Element numberOfGPUsField = xpath("//md-select[@placeholder='Number of GPUs']");
    Element selectOneGPUOption = xpath("//md-option[@id='select_option_518']");
    Element localSSDField = xpath("//md-select[@placeholder='Local SSD']");
    Element ssd2x375GBOption = xpath("//md-option[@id='select_option_494']");
    Element datacenterLocation = xpath("//md-select[@placeholder='Datacenter location']");
    Element locationFrankfurt = xpath("//md-option[@id='select_option_264']");
    Element committedUsage = xpath("//md-select[@placeholder='Committed usage']");
    Element oneYearCommittedUsageOption = xpath("//md-option[@id='select_option_139']");
    Element addToEstimateButton = xpath("//button[@class='md-raised md-primary cpc-button md-button md-ink-ripple']");
    Element totalEstimateCost = xpath("//div[@class='cpc-cart-total']");
    Element emailEstimateButton = xpath("//button[@id='Email Estimate']");
    Element emailField = xpath("//input[@ng-model='emailQuote.user.email']");
    Element sendEmailButton = xpath("//md-dialog-actions/button[@ng-disabled='emailForm.$invalid']");

    public GoogleCloudPricingCalculatorPage enterNumberOfInstances(String instanceNumber) {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        numberOfInstancesField.click();
        numberOfInstancesField.sendKeys(instanceNumber);
        switchToDefaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectN1Series() {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        seriesField.click();
        n1SeriesOption.click();
        switchToDefaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectMachineType(String type) {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        machineTypeField.click();
        xpath("//md-option[@value='" + type + "']").click();
        switchToDefaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectAddGPUCheckbox() {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        addGPUCheckbox.click();
        switchToDefaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectGPUType(String type) {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        gpuTypeField.click();
        xpath("//md-option[@value='" + type + "']").click();
        switchToDefaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectOneGPU() {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        numberOfGPUsField.click();
        selectOneGPUOption.click();
        switchToDefaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectSSD2x375GB() {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        localSSDField.click();
        ssd2x375GBOption.click();
        switchToDefaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectDatacenterLocationFrankfurt() {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        datacenterLocation.click();
        locationFrankfurt.click();
        switchToDefaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectOneYearCommittedOption() {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        committedUsage.click();
        oneYearCommittedUsageOption.click();
        switchToDefaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage clickAddToEstimateButton() {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        addToEstimateButton.click();
        switchToDefaultContent();
        return this;
    }

    public String getTotalEstimateMonthlyCost() {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();

        String totalEstimateMonthlyCost = totalEstimateCost.getText();
        switchToDefaultContent();

        totalEstimateMonthlyCost = totalEstimateMonthlyCost.replace("Total Estimated Cost: USD ", "");
        return  totalEstimateMonthlyCost.replace(" per 1 month", "");
    }

    public void emailEstimateTo(String email) {
        googleIframe.switchToFrame();
        cloudPricingIframe.switchToFrame();
        emailEstimateButton.click();
        emailField.sendKeys(email);
        sendEmailButton.click();
        switchToDefaultContent();
    }
}
