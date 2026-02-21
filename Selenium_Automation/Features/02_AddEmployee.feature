Feature: Add Employee

  Scenario: Add new employee successfully
    Given User is logged into OrangeHRM
    When User navigates to PIM module
    And User clicks Add Employee
    And User enters employee details
    And User clicks Save button
    Then Employee should be added successfully
