package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement amazonSearchTextBox;

    @FindBy(xpath = "(//img[@class='s-image'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//div[@id='priceRefinements']")
    public WebElement priceFilter;

    @FindBy(xpath = "//input[@id='low-price']")
    public WebElement minPrice;

    @FindBy(xpath = "//input[@id='high-price']")
    public WebElement maxPrice;

    @FindBy(xpath = "//span[@class='a-button a-spacing-top-mini a-button-base s-small-margin-left']")
    public WebElement filterPriceGoButton;

    @FindBy(xpath = "//span[text()='No results for ']")
    public WebElement negativeResultText;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    public WebElement resultText;
}
