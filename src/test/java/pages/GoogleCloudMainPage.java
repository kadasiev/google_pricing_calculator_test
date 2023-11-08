package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleCloudMainPage extends BasePage{
    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchField;

    @FindBy(xpath = "//a[@class='b85hwe nKZVnd']")
    private WebElement signInButton;

    @FindBy(xpath = "//div[@id='gb']/div/div/div/div/a")
    private WebElement accountSettingButton;

    @FindBy(xpath = "//a[@target='_top']/span/div/div")
    private WebElement signOutButton;

    public GoogleCloudMainPage openPage() {
        driver.get("https://cloud.google.com/");
        return this;
    }

    public GoogleCloudSearchResultPage searchInGoogleCloud(String searchText) {
        wait.until(ExpectedConditions.visibilityOf(searchField)).click();
        searchField.sendKeys(searchText);
        searchField.sendKeys(Keys.RETURN);
        return new GoogleCloudSearchResultPage();
    }
}
