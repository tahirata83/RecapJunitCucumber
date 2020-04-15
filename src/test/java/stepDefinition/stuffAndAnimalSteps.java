package stepDefinition;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjectModel.homePage;

public class stuffAndAnimalSteps {

    homePage homePage = new homePage();

    @And("^Hover over on Toys & Entertainment$")
    public void hover_over_on_Toys_Entertainment() {
        homePage.hoverOverOnbuttonToysAndEntertainment();
    }

    @And("^Click on Stuffed Animals$")
    public void click_on_Stuffed_Animals() {

        homePage.clickOnButtonStuffedAnimals();
    }

    @Then("^Verify URL contains Stuffed Animals$")
    public void verify_URL_contains_Stuffed_Animals() {
        homePage.verifyURL( "stuffed" );
        homePage.verifyURL( "animals" );

    }
}