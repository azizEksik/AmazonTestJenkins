

Feature: as a visitor, I should be able to search for the product I want using the search bar and after adding it to my basket, I should be able to see the product I added in my basket

  @E2E
  Scenario: TC_01 >>> It should be confirmed that the search bar, the first search result, the 'add to cart' button on the product page, and the shopping cart icon are all visible and accessible, and that clicking the icon verifies the selected product matches the added product

    * Open the browser and go to "amazonUrl"
    * Verify that the search bar is visible and accessible
    * Enter "iPhone" into the search bar and perform the search
    * Confirm that the first product on the opened page is visible and accessible
    * Click on the first product
    * Confirm that the add to cart button is visible and accessible on the opened page
    * Click on the add to cart button
    * Confirm that the shopping cart link in the top-left corner of the page is visible and accessible
    * Click on the shopping cart link in the top-left corner
    * Confirm that you are on the shopping cart page
    * Verify that the added product matches the product in the cart
    * Close the browser