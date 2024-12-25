package pages;

import static driver.Driver.switchToDefaultContent;
import static driver.DriverFactory.getDriver;
import static element.Element.xpath;

import element.Element;
import org.openqa.selenium.remote.RemoteWebDriver;

public class YOPMailGeneratorPage {

    Element pageIframe = xpath("//iframe[@id='aswift_6']");
    Element adIframe = xpath("//div/iframe[@id='ad_iframe']");
    Element closeAdButton = xpath("//div[@id='dismiss-button']");
    Element generatedEmail = xpath("//span[@class='genytxt']");

    public String getGeneratedEmailAddress() {
        pageIframe.switchToFrame();
        adIframe.switchToFrame();
        ((RemoteWebDriver) getDriver()).executeScript("arguments[0].click();",
            closeAdButton.waitForVisibility());
        switchToDefaultContent();
        return generatedEmail.get(0).getText() + "@" + generatedEmail.get(1).getText();
    }
}
