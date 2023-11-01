package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class YOPMailGeneratorPage extends BasePage{
    @FindBy(xpath = "//iframe[@id='aswift_6']")
    private WebElement pageIframe;

    @FindBy(xpath = "//div/iframe[@id='ad_iframe']")
    private WebElement adIframe;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    private WebElement closeAdButton;

    @FindBy(xpath = "//span[@class='genytxt']")
    private List<WebElement> generatedEmail;

    public String getGeneratedEmailAddress() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(pageIframe));
        driver.switchTo().frame(adIframe);

        ((RemoteWebDriver) driver).executeScript("arguments[0].click();", closeAdButton);

        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.visibilityOfAllElements(generatedEmail));
        return generatedEmail.get(0).getText() + "@" + generatedEmail.get(1).getText();
    }
}
