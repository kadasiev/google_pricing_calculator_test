package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private final static WebDriver driver;
    private static String googlePricingTab;
    private static String yopMailTab;

    static {
        switch(System.getProperty("browser")) {
            case "Firefox":
                driver = new FirefoxDriver();
                yopMailTab = getDriver().getWindowHandle();
                getDriver().switchTo().newWindow(WindowType.TAB);
                googlePricingTab = getDriver().getWindowHandle();
                break;
            case "Chrome":
                driver = new ChromeDriver();
                yopMailTab = getDriver().getWindowHandle();
                getDriver().switchTo().newWindow(WindowType.TAB);
                googlePricingTab = getDriver().getWindowHandle();
                break;
            default:
                driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getGooglePricingTab() {
        return googlePricingTab;
    }

    public static String getYOPMailTab() {
        return yopMailTab;
    }
}
