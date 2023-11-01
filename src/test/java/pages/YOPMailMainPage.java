package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YOPMailMainPage extends BasePage{
    @FindBy(xpath = "//div/div/a[@href='email-generator']")
    private WebElement randomEmailGeneratorButton;

    @FindBy(xpath = "//button[@title='Check Inbox @yopmail.com']")
    private WebElement openMailboxButton;

    public YOPMailMainPage openPage() {
        driver.get("https://yopmail.com/");
        return this;
    }

    public YOPMailGeneratorPage generateNewEmailAddress() {
        wait.until(ExpectedConditions.visibilityOf(randomEmailGeneratorButton)).click();
        return new YOPMailGeneratorPage();
    }

    public YOPMailboxPage openYOPMailBox() {
        wait.until(ExpectedConditions.visibilityOf(openMailboxButton)).click();
        return new YOPMailboxPage();
    }
}
