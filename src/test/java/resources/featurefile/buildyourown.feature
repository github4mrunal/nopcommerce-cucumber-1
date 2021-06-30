Feature: Build your own computer page functionality.

  As a user I should be able to navigate through build your own computer page successful
  @Smoke
  Scenario: user should be able to buy product from build your own computer page.
    Given I am on homepage
    And  I click  on 'computers' tab
    And I click on 'desktop'
    And I select "Name: A to Z" from dropdown
    And I click on 'add to cart' button
    When I see 'build your own' page
    And I select "2.2 GHz Intel Pentium Dual-Core E2200" from  processor dropdown
    And I select "8GB [+$60.00]" from ram drop down list
    And I select '400 GB [+$100.00]' radio button
    And I select 'Vista Premium [+$60.00]' radio button
    And I select two check boxes 'Microsoft Office [+$50.00]' and 'Total Commander[+$5.00]'.
    And I verify Price '$1,475.00'
    And I click on 'ADD TO CART' button
    Then I should see Message on top green bar like 'The product has been added to your shopping cart'


