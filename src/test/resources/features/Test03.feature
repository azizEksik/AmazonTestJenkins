

Feature: As a visitor, when I enter the product I want into the search bar and perform a search, I should be able to confirm that the results include the product I entered.

  @SMOKE
  Scenario: TC_01 >>> After entering a product into the search bar, I should be able to verify that the search results contain the entered product

    * Open the browser and go to "amazonUrl"
    * Verify that the search bar is visible and accessible
    * Enter "iPhone" into the search bar and perform the search
    * It is confirmed that the search results contain "iPhone"
    * Close the browser