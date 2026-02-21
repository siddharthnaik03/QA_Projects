Feature: OrangeHRM Login

  Scenario: Valid Login
    Given User launches the browser
    When User opens OrangeHRM login page
    And User enters username and password
    And Clicks on login button
    Then User should navigate to dashboard
