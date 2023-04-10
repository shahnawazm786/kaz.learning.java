Feature: Add to cart
  Scenario: Add to cart
    Given I goto cart page
    And I select the item from the cart
    When I click on add to cart button
    Then Selected item move to the cart
