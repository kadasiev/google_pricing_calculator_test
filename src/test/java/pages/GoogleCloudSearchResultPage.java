package pages;

import static element.Element.xpath;

import element.Element;

public class GoogleCloudSearchResultPage {
    Element pricingCalculatorLink = xpath("//a[@class='gs-title']");

    public GoogleCloudPricingCalculatorPage openPricingCalculator() {
        pricingCalculatorLink.click();
        return new GoogleCloudPricingCalculatorPage();
    }
}
