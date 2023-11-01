package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YOPMailboxPage extends BasePage {
    @FindBy(xpath = "//iframe[@id='ifmail']")
    private WebElement iframe;

    @FindBy(xpath = "//td[2]/h3")
    private WebElement estimateMonthlyCost;

    public String getEstimateMonthlyCostFromEmail() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
        return wait.until(ExpectedConditions.visibilityOf(estimateMonthlyCost))
                .getText().replace("USD ", "");
    }
}
