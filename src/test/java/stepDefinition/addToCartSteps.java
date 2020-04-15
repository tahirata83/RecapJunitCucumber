package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.homePage;
import pageObjectModel.itemPage;
import pageObjectModel.searchPage;
import utilities.Driver;
import utilities.readProperties;

public class addToCartSteps {

    WebDriver driver = Driver.getDriver();

    homePage homePage=new homePage();
    searchPage searchPage = new searchPage();
    itemPage itemPage = new itemPage();

    @Given("^Navigate to website$")
    public void navigate_to_website() {
     driver.get( readProperties.getData( "URL" ) );
     driver.manage().window().maximize();
    }

    @And("^click Accept button$")
    public void click_Accept_button() {
     homePage.clickOnButtonAccept();
    }

    @And("^click Understand button$")
    public void click_Understand_button() {
     homePage.clickOnButtonUnderstand();
    }

    @And("^Search for \"([^\"]*)\"$")
    public void search_for(String arg1) {
     homePage.writeInSeachButton(arg1);
    }

    @And("^Click on search button$")
    public void click_on_search_button() {
     homePage.clickOnButtonSearch();
    }

    @And("^Click on any item$")
    public void click_on_any_item() {
    searchPage.clickAnyProducts();
    }

    @And("^Fill all the required fields$")
    public void fill_all_the_required_fields() {
        itemPage.chooseRandomInDropdownList();
        itemPage.typeInInputList();
    }

    @When("^Click on Add to cart button$")
    public void click_on_Add_to_cart_button() {
        itemPage.clickOnAddToCart();
    }

    @Then("^Verify I am in the cart page$")
    public void verify_I_am_in_the_cart_page() {
        itemPage.verifyURL("cart");
    }

}
