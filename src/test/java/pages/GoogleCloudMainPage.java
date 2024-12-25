package pages;

import static element.Element.xpath;

import element.Element;
import org.openqa.selenium.Keys;

public class GoogleCloudMainPage {

    Element searchField = xpath("//input[@aria-label='Search']");
    Element signInButton = xpath("//a[@class='b85hwe nKZVnd']");
    Element accountSettingButton = xpath("//div[@id='gb']/div/div/div/div/a");
    Element signOutButton = xpath("//a[@target='_top']/span/div/div");

    public GoogleCloudSearchResultPage searchInGoogleCloud(String searchText) {
        searchField.sendKeys(searchText);
        searchField.sendKeys(Keys.RETURN);
        return new GoogleCloudSearchResultPage();
    }
}
