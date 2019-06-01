Feature: Calculate total from a list of real numbers

Scenario: Calculate summation of a list of real numbers
    Given a list of real numbers
        |25.0|
        |1500.0|
        |580.0|
        |600.0|
    When I calculate the sum of them
    Then I will get 2705.0