package util;

import static driver.DriverFactory.getDriver;
import static driver.DriverFactory.getGooglePricingTab;
import static driver.DriverFactory.getYOPMailTab;

public class BrowserTabsManager {
    public static void switchToGooglePricingTab() {
        getDriver().switchTo().window(getGooglePricingTab());
    }

    public static void switchToYOPMailTab() {
        getDriver().switchTo().window(getYOPMailTab());
    }
}
