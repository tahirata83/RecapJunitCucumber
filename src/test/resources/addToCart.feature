Feature: adding to cart
  Scenario: Add to cart

    Given Navigate to website
    And click Accept button
    And click Understand button
    And Search for "Teddy bear "
    And Click on search button
    And Click on any item
    And Fill all the required fields
    When Click on Add to cart button
    Then Verify I am in the cart page

    # to run the code multiple times
  @SmokeTest
  Scenario Outline:
    Given Navigate to website
    And click Accept button
    And click Understand button
    And Search for "<item to search> "
    And Click on search button
    And Click on any item
    And Fill all the required fields
    When Click on Add to cart button
    Then Verify I am in the cart page

    Examples:
    | item to search |
    | phone accessories |
    | hand sentiser |