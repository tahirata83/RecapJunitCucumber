package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.searchPage;

public class searchPriceFilterSteps {

    searchPage searchPage = new searchPage();

    @When("^click on price filter fifty to hundred$")
    public void click_on_price_filter_fifty_to_hundred() {
        searchPage.clickOnRadioButton50to100();
    }

    @Then("^Verify all pricess are between fifty and hundred$")
    public void verify_all_pricess_are_between_fifty_and_hundred() {
        searchPage.verifyBetween();
    }

    @Given("^click on price filter twenty to fifty$")
    public void click_on_price_filter_twenty_to_fifty() {
        searchPage.clickOnbutton20to50();
    }

    @Then("^Verify all prices are between twenty to fifty$")
    public void verify_all_prices_are_between_twenty_to_fifty() {
        searchPage.verifyBetween20to75();
    }



}




