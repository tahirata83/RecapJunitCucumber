package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class searchPage extends AbstractClass {

    WebDriver driver= Driver.getDriver();

    public searchPage(){

        PageFactory.initElements(driver,this);
    }


    @FindAll({
            @FindBy(xpath = "//img[contains(@class,'width-full wt-height-full display-block position-absolute ')]")
    })
    private List<WebElement> products;

    public void clickAnyProducts(){
        clickRandomNum( products );
        switchWindow();
    }

    @FindBy(xpath = "//span[contains(text(),'EUR 50 to EUR 100')]")
    private WebElement radioButton50to100;

    public void clickOnRadioButton50to100(){
        clickFunctionality( radioButton50to100 );
    }


    @FindAll({
            @FindBy(xpath = "//span[contains(@class,'text-body-larger')]/span[@class='currency-value']")
    })
    private List<WebElement> allPrices;


    public void verifyBetween(){

        betweenNumbers( 50,100, allPrices);
        System.out.println("Done1");
    }



    @FindBy(xpath = "//div[@aria-label='Select a price range']//child::div[3]/a/span")
    private WebElement button20to50;

    public void clickOnbutton20to50(){
        clickFunctionality( button20to50 );
    }

    public void verifyBetween20to75(){

        betweenNumbers( 20,50, allPrices);
        System.out.println("Done2");
    }


}
