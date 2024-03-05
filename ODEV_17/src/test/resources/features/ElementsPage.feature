Feature: I want to click button on the elements Page

  Scenario Outline: Click Buttons
    Given Open the web site
    When  User clicks on Buttons button
    Then  The system views buttons page
    When  User clicks on Click Me button
    Then  System views "<message>"
    Examples:
    |message|
    |You have done a dynamic click|