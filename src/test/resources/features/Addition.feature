@Done
Feature: User is able to add digits

  As a user
  I want to add numbers
  So that I can calculate result of addition

  Scenario: User adds two simple digits
    When User types "2"
    And User choose "add" option
    And User types "1"
    And User calculates result
    Then Number "3" is displayed on the screen

  Scenario Outline: User is able to calculate sum of provided digits
    Given User adds "<A>" and "<B>"
    When User calculates result
    Then Number "<Result>" is displayed on the screen

    Scenarios:
      | A  | B  | Result |
      | 10 | 10 | 20     |
      | 50 | 25 | 75     |
