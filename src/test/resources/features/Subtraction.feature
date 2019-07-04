Feature: User is able to subtract digits

  As a user
  I want to subtract numbers
  So that I can calculate result of subtraction

  @Dev
  Scenario: User subtracts two simple digits
    When User types "8"
    And User choose "subtract" option
    And User types "7"
    And User calculates result
    Then Number "1" is displayed on the screen

  Scenario Outline: User is able to calculate subtraction of provided digits
    Given User subtracts "<B>" from "<A>"
    When User calculates result
    Then Number "<Result>" is displayed on the screen

    Scenarios:
      | A  | B  | Result |
      | 10 | 10 | 0      |
      | 25 | 50 | 25     |
      | 12 | 20 |8     |
