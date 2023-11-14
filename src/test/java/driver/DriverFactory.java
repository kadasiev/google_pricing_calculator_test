package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static WebDriver driver;
    private final static String googlePricingTab;
    private final static String yopMailTab;

    static {
        switch(System.getProperty("browser")) {
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Chrome":
                driver = new ChromeDriver();
                break;
        }
        yopMailTab = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        googlePricingTab = driver.getWindowHandle();
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
