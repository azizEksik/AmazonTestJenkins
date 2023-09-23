package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepdefiniton {

    AmazonPage amazonPage = new AmazonPage();
    Actions actions = new Actions(Driver.getDriver());


    //------------------------Test_02------------------------------//

    @Given("Open the browser and go to {string}")
    public void open_the_browser_and_go_to(String url) {

        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }

    @Given("Verify that the search bar is visible and accessible")
    public void verify_that_the_search_bar_is_visible_and_accessible() {

        Assert.assertTrue(amazonPage.amazonSearchTextBox.isDisplayed());
        Assert.assertTrue(amazonPage.amazonSearchTextBox.isEnabled());
    }

    @Given("Enter {string} into the search bar and perform the search")
    public void enter_into_the_search_bar_and_perform_the_search(String iphone) {

        amazonPage.amazonSearchTextBox.sendKeys(iphone + Keys.ENTER);
    }

    @Given("Confirm that the first product on the opened page is visible and accessible")
    public void confirm_that_the_first_product_on_the_opened_page_is_visible_and_accessible() {

        Assert.assertTrue(amazonPage.firstProduct.isDisplayed());
        Assert.assertTrue(amazonPage.firstProduct.isEnabled());
    }

    @Given("Click on the first product")
    public void click_on_the_first_product() {

        amazonPage.firstProduct.click();
    }

    @Given("Confirm that the add to cart button is visible and accessible on the opened page")
    public void confirm_that_the_button_is_visible_and_accessible_on_the_opened_page() {

    }
    @Given("Click on the add to cart button")
    public void click_on_the_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Confirm that the shopping cart link in the top-left corner of the page is visible and accessible")
    public void confirm_that_the_shopping_cart_link_in_the_top_left_corner_of_the_page_is_visible_and_accessible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click on the shopping cart link in the top-left corner")
    public void click_on_the_shopping_cart_link_in_the_top_left_corner() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Confirm that you are on the shopping cart page")
    public void confirm_that_you_are_on_the_shopping_cart_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify that the added product matches the product in the cart")
    public void verify_that_the_added_product_matches_the_product_in_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    //------------------------Test_01------------------------------//

    //------------------------Test_02------------------------------//

    @Given("Close the browser")
    public void close_the_browser() {
        Driver.quitDriver();
    }

    @Given("Confirm that the price filters from the left-hand side filtering options are visible")
    public void confirm_that_the_price_filters_from_the_left_hand_side_filtering_options_are_visible() {

        Assert.assertTrue(amazonPage.priceFilter.isDisplayed());
    }
    @Given("Confirm that the minimum and maximum price text boxes are visible and accessible")
    public void confirm_that_the_minimum_and_maximum_price_text_boxes_are_visible_and_accessible() {

        Assert.assertTrue(amazonPage.minPrice.isDisplayed());
        Assert.assertTrue(amazonPage.minPrice.isEnabled());

        Assert.assertTrue(amazonPage.maxPrice.isDisplayed());
        Assert.assertTrue(amazonPage.maxPrice.isEnabled());
    }
    @Given("Enter {int} as the price into the minimum price text box")
    public void enter_as_the_price_into_the_minimum_price_text_box(Integer price) throws InterruptedException {

        Thread.sleep(2000);
        amazonPage.minPrice.sendKeys(""+price);
    }
    @Given("Click on the Go button")
    public void click_on_the_go_button() throws InterruptedException {

        Thread.sleep(1000);
        amazonPage.filterPriceGoButton.click();
    }
    @Given("Confirm that the search results display {string}")
    public void confirm_that_the_search_results_display(String expected) throws InterruptedException {

        Thread.sleep(2000);

        String expectedText = expected;
        String actualText = amazonPage.negativeResultText.getText();

        Assert.assertTrue(expectedText.contains(actualText));

    }

    //------------------------Test_02------------------------------//


    //------------------------Test_03------------------------------//

    @Given("It is confirmed that the search results contain {string}")
    public void it_is_confirmed_that_the_search_results_contain(String iphone) throws InterruptedException {

        Thread.sleep(2000);

        String expectedResultText = iphone;
        String actualResultText = amazonPage.resultText.getText();

        Assert.assertTrue(actualResultText.contains(expectedResultText));
    }

    //------------------------Test_03------------------------------//

}
