Feature: Checking Products Arrange In AlphaBetical Order on Desktop Page

  As a user I should be able to arrange products arrange alphabetically
@Sanity
  Scenario: User should be able to arrange products alphabetically
    Given I am on Homepage
    And   I hover mouse on Computers tab
    And   I click on Desktop tab
    When   I select  "Name: Z to A" from dropdown
    Then  I should see products arranged in reverse alphabetical order



