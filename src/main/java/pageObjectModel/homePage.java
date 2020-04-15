package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class homePage extends AbstractClass {

    WebDriver driver= Driver.getDriver();

    public homePage(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@data-id='search-query']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[text()='Accept']")
    private WebElement acceptButton;

    @FindBy(xpath = "//button[text()='I understand']")
    private WebElement understandButton;

    @FindBy(xpath = "//button[@value='Search']")
    private WebElement buttonSearch;

    public void writeInSeachButton(String search){
        sendKeysFunctionality( searchInput ,  search);
    }
    public void clickOnButtonAccept(){
        clickFunctionality(acceptButton);
    }

    public void clickOnButtonUnderstand(){
        clickFunctionality(understandButton);
    }
    public void clickOnButtonSearch(){
        clickFunctionality( buttonSearch );
    }

    @FindBy(xpath = "//span[contains(text(),'Toys & Entertainment')]")
    private WebElement buttonToysAndEntertainment;

    public void hoverOverOnbuttonToysAndEntertainment(){
        hoverOver(buttonToysAndEntertainment);
    }

    @FindBy(xpath = "//a[contains(text(),'Stuffed Animals')]")
    private WebElement buttonStuffedAnimals;

    public void clickOnButtonStuffedAnimals(){
        clickFunctionality( buttonStuffedAnimals );
    }

}


