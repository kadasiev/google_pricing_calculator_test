package pages;

import static element.Element.xpath;

import element.Element;

public class YOPMailMainPage {

    Element randomEmailGeneratorButton = xpath("//div/div/a[@href='email-generator']");
    Element openMailboxButton = xpath("//button[@title='Check Inbox @yopmail.com']");

    public YOPMailGeneratorPage generateNewEmailAddress() {
        randomEmailGeneratorButton.click();
        return new YOPMailGeneratorPage();
    }

    public YOPMailboxPage openYOPMailBox() {
       openMailboxButton.click();
        return new YOPMailboxPage();
    }
}
