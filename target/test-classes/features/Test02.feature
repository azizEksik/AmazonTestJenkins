

Feature: As a visitor, I should be able to confirm that there are no products matching my search criteria in the search results after applying filters

  @NegativeResult
  Scenario: TC_01 >>> I should be able to confirm that when I enter extreme criteria for filtering in the search results, no results are found

    * Open the browser and go to "amazonUrl"
    * Verify that the search bar is visible and accessible
    * Enter "iPhone" into the search bar and perform the search
    * Confirm that the price filters from the left-hand side filtering options are visible
    * Confirm that the minimum and maximum price text boxes are visible and accessible
    * Enter 10000 as the price into the minimum price text box
    * Click on the Go button
    * Confirm that the search results display "No results for iPhone."
    * Close the browser