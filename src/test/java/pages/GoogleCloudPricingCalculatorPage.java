package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleCloudPricingCalculatorPage extends BasePage {
    @FindBy(xpath = "//article[@id='cloud-site']/devsite-iframe/iframe")
    private WebElement googleIframe;

    @FindBy(xpath = "//iframe[@id='myFrame']")
    private WebElement cloudPricingIframe;

    @FindBy(xpath = "//input[@aria-label='quantity']")
    private WebElement numberOfInstancesField;

    @FindBy(xpath = "//md-select[@placeholder='Series']")
    private WebElement seriesField;

    @FindBy(xpath = "//md-option[@id='select_option_223']")
    private WebElement n1SeriesOption;

    @FindBy(xpath = "//md-select[@placeholder='Instance type']")
    private WebElement machineTypeField;

    @FindBy(xpath = "//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']")
    private WebElement n1_standard_8Option;

    @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs']")
    private WebElement addGPUCheckbox;

    @FindBy(xpath = "//md-select[@placeholder='GPU type']")
    private WebElement gpuTypeField;

    @FindBy(xpath = "//md-option[@value='NVIDIA_TESLA_V100']")
    private WebElement nvidia_tesla_v100GPUOption;

    @FindBy(xpath = "//md-select[@placeholder='Number of GPUs']")
    private WebElement numberOfGPUsField;

    @FindBy(xpath = "//md-option[@id='select_option_518']")
    private WebElement selectOneGPUOption;

    @FindBy(xpath = "//md-select[@placeholder='Local SSD']")
    private WebElement localSSDField;

    @FindBy(xpath = "//md-option[@id='select_option_491']")
    private WebElement ssd2x375GBOption;

    @FindBy(xpath = "//md-select[@placeholder='Datacenter location']")
    private WebElement datacenterLocation;

    @FindBy(xpath = "//md-option[@id='select_option_264']")
    private WebElement locationFrankfurt;

    @FindBy(xpath = "//md-select[@placeholder='Committed usage']")
    private WebElement committedUsage;

    @FindBy(xpath = "//md-option[@id='select_option_139']")
    private WebElement oneYearCommittedUsageOption;

    @FindBy(xpath = "//button[@class='md-raised md-primary cpc-button md-button md-ink-ripple']")
    private WebElement addToEstimateButton;

    @FindBy(xpath = "//div[@class='cpc-cart-total']")
    private WebElement totalEstimateCost;

    @FindBy(xpath = "//button[@id='Email Estimate']")
    private WebElement emailEstimateButton;

    @FindBy(xpath = "//input[@ng-model='emailQuote.user.email']")
    private WebElement emailField;

    @FindBy(xpath = "//md-dialog-actions/button[@ng-disabled='emailForm.$invalid']")
    private WebElement sendEmailButton;

    public GoogleCloudPricingCalculatorPage enterNumberOfInstances(String instanceNumber) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        numberOfInstancesField.click();
        numberOfInstancesField.sendKeys(instanceNumber);

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
//        wait.until(ExpectedConditions.visibilityOf(numberOfInstancesField)).click();
//        numberOfInstancesField.sendKeys(instanceNumber);
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectN1Series() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        wait.until(ExpectedConditions.visibilityOf(seriesField)).click();
        wait.until(ExpectedConditions.visibilityOf(n1SeriesOption)).click();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectCPU8RUM30Machine() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        wait.until(ExpectedConditions.visibilityOf(machineTypeField)).click();
        wait.until(ExpectedConditions.visibilityOf(n1_standard_8Option)).click();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectAddGPUCheckbox() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        wait.until(ExpectedConditions.visibilityOf(addGPUCheckbox)).click();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectNvidia_tesla_v100GPUType() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        wait.until(ExpectedConditions.visibilityOf(gpuTypeField)).click();
        wait.until(ExpectedConditions.visibilityOf(nvidia_tesla_v100GPUOption)).click();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectOneGPU() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        wait.until(ExpectedConditions.visibilityOf(numberOfGPUsField)).click();
        wait.until(ExpectedConditions.visibilityOf(selectOneGPUOption)).click();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectSSD2x375GB() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        wait.until(ExpectedConditions.visibilityOf(localSSDField)).click();
        wait.until(ExpectedConditions.visibilityOf(ssd2x375GBOption)).click();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectDatacenterLocationFrankfurt() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        wait.until(ExpectedConditions.visibilityOf(datacenterLocation)).click();
        wait.until(ExpectedConditions.visibilityOf(locationFrankfurt)).click();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage selectOneYearCommittedOption() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        wait.until(ExpectedConditions.visibilityOf(committedUsage)).click();
        wait.until(ExpectedConditions.visibilityOf(oneYearCommittedUsageOption)).click();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        return this;
    }

    public GoogleCloudPricingCalculatorPage clickAddToEstimateButton() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        addToEstimateButton.click();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        return this;
    }

    public String getTotalEstimateMonthlyCost() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        String totalEstimateMonthlyCost = totalEstimateCost.getText();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        totalEstimateMonthlyCost = totalEstimateMonthlyCost.replace("Total Estimated Cost: USD ", "");
        return  totalEstimateMonthlyCost.replace(" per 1 month", "");
    }

    public void emailEstimateTo(String email) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
        driver.switchTo().frame(cloudPricingIframe);

        emailEstimateButton.click();
        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
        sendEmailButton.click();

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
    }
}
