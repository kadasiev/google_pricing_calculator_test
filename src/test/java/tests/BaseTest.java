package tests;

import static driver.DriverFactory.closeBrowser;
import static driver.DriverFactory.openBrowser;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import steps.PricingCalculatorSteps;
import steps.YOPMailSteps;
import util.TestListener;

@Listeners({TestListener.class})
public class BaseTest {

  PricingCalculatorSteps pricingCalculatorSteps = new PricingCalculatorSteps();
  YOPMailSteps yopMailSteps = new YOPMailSteps();

  @BeforeClass
  public void setUp() {
    openBrowser();
  }

  @AfterClass
  public void tearDown() {
     closeBrowser();
  }
}
