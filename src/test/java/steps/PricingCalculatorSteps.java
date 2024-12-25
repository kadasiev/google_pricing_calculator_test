package steps;

public class PricingCalculatorSteps extends BaseSteps {

  public void searchInGoogleCloud(String searchText) {
    googleCloudMainPage.searchInGoogleCloud(searchText);
  }

  public void emailEstimateTo(String email) {
    googleCloudPricingCalculatorPage.emailEstimateTo(email);
  }
}
