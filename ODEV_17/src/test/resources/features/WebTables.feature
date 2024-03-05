Feature: I want to add new record in the table

  Scenario Outline: Add and Edit Record
    Given Open the web site to add record
    When  User clicks on Add button
    And  User sends name to record "<name>"
    And  User sends surname to record "<surname>"
    And  User sends mail to record "<mail>"
    And  User sends age to record "<age>"
    And  User sends salary to record "<salary>"
    And  User sends department to record "<department>"
    And  User clicks on Submit button
    Then System adds relevant record
    When User changes relevant record "<changeDepartment>"
    And  User clicks on Submit button
    Then System adds relevant record

    Examples:
      | name | surname | mail                  | age | salary  | department  | changeDepartment|
      | Ece  | Gurbuz  | ecegrbzz@yopmail.com  | 23  | 123123  | QA          | QA Engineer     |