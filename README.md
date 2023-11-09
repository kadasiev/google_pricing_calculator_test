Practical Task

Develop an automation framework for the Hardcore task in WebDriver.

The final framework should include the following:

    A WebDriver manager for managing browser connectors
    Page Object/Page Factory for page abstractions
    Models for business objects of the required elements
    Property files with test data for at least two different environments
    XML suites for smoke tests and other tests
    If the test fails, a screenshot with the date and time is taken.
    The framework should include an option for running with Jenkins and browser parameterization, test suite, environment.
    Test results should be displayed on the job chart, and the screenshots should be archived as artifacts.


Hardcore

For this task, please, use the Selenium WebDriver power, framework unit test, and Page Object concepts. Automate the following script:

    Open https://cloud.google.com/
    Click on the icon at the top of the portal page and enter "Google Cloud Platform Pricing Calculator" into the search field.
    Perform the search.
    Click "Google Cloud Platform Pricing Calculator" in the search results and go to the calculator page.
    Click COMPUTE ENGINE at the top of the page.
    Fill out the form with the following data:

* Number of instances: 4

* What are these instances for?: leave blank

* Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or another User-Provided OS

* VM Class: Regular

* Instance type: n1-standard-8 (vCPUs: 8, RAM: 30 GB)

* Select “Add GPUs“

* Number of GPUs: 1

* GPU type: NVIDIA Tesla V100

* Local SSD: 2x375 Gb

* Datacenter location: Frankfurt (europe-west3)

* Committed usage: 1 Year

  Click 'Add to Estimate'.
  Select 'EMAIL ESTIMATE'.
  In a new tab, open https://yopmail.com/ or a similar temporary email–generating service.
  Copy the email generated in yopmail.com.
  Return to the calculator and enter the above email into the email field.
  Press 'SEND EMAIL'.
  Wait for the cost estimate email and check that the emailed 'Total Estimated Monthly Cost' matches the result in the calculator.
