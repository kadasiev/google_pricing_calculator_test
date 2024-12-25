package steps;

public class YOPMailSteps extends BaseSteps {

  public String getNewMailAddress() {
    return yopMailMainPage.generateNewEmailAddress()
        .getGeneratedEmailAddress();
  }

  public String getEstimateMonthlyCostFromEmail() {
    return yopMailMainPage.openYOPMailBox()
        .getEstimateMonthlyCostFromEmail();
  }
}
