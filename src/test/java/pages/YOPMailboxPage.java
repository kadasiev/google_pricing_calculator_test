package pages;

import static element.Element.xpath;

import element.Element;

public class YOPMailboxPage {

    Element iframe = xpath("//iframe[@id='ifmail']");
    Element estimateMonthlyCost = xpath("//td[2]/h3");

    public String getEstimateMonthlyCostFromEmail() {
        iframe.switchToFrame();
        return estimateMonthlyCost.getText()
            .replace("USD ", "");
    }
}
