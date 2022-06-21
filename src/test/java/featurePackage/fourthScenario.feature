Feature: Checkout
  Scenario: Checkout an apple
    Given the price of a "apple" is 10PLN
    When I checkout 1 "apple"
    Then the total price should be 10PLN