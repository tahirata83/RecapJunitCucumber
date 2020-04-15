     Feature: Search Price between 50 to 100

#    background is specific for one feature file
#    background will run before every scenario or scenario outline

    Background:
    Given Navigate to website
    And click Accept button
    And click Understand button
    And Search for "Teddy bear "
    And Click on search button

    @SmokeTest
    Scenario: Search Price between 50 to 100
    When  click on price filter fifty to hundred
    Then Verify all pricess are between fifty and hundred

    @SmokeTest
    Scenario: Search price between 20 to 50
    And click on price filter twenty to fifty
    Then Verify all prices are between twenty to fifty