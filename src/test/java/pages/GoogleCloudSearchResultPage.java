package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleCloudSearchResultPage extends BasePage {
    @FindBy(xpath = "//a[@class='gs-title']")
    WebElement pricingCalculatorLink;

    public GoogleCloudPricingCalculatorPage openPricingCalculator() {
        wait.until(ExpectedConditions.visibilityOf(pricingCalculatorLink));
        pricingCalculatorLink.click();
        return new GoogleCloudPricingCalculatorPage();
    }
}
