Feature: Cocktail Ordering

  As Romeo, I want to offer a drink to Juliette so that we can discuss together (and maybe more).

  Scenario: Creating an empty order
    Given "Romeo" wants to buy a drink
    When an order is declared for "Juliette"
    When <1> cocktail is added to the order, named "Mojito"
    Then there is <1> cocktail in the order

  Scenario: Creating another empty order
    Given "Pierre" wants to buy a drink
    When an order is declared for "jack"
    When <1> cocktail is added to the order, named "Mojito"
    Then there is <2> cocktail in the order
