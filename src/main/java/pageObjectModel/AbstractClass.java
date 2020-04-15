package pageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class AbstractClass {

    //   create a reusable method for click functionality
    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait( driver , 30 );

    public void clickFunctionality(WebElement clickButton){

        wait.until( ExpectedConditions.elementToBeClickable( clickButton ) );
        clickButton.click();

    }

    //   create a reusable method for sendkeys functionality
    public void sendKeysFunctionality(WebElement sendKeysButton , String value){

        wait.until( ExpectedConditions.visibilityOf( sendKeysButton ) );
        sendKeysButton.sendKeys( value );
    }

    public int randomNum(int max){

        Random rnd = new Random(  );

        int myRandom = rnd.nextInt(max);

        return myRandom;

    }

    public void clickRandomNum(List<WebElement> listOfElements){

        int rnd = randomNum( listOfElements.size() );

        clickFunctionality( listOfElements.get( rnd ) );

    }

    public void switchWindow(){

        Set<String> windows=  driver.getWindowHandles();

        for(String myWin:windows){

            driver.switchTo().window( myWin );

            System.out.println(driver.getCurrentUrl());

        }
  }

    public void sleep(int num){

        try {
            Thread.sleep( num * 1000 );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void selectInTheDropdown(WebElement dropdown){

        Select select = new Select( dropdown );

        List<WebElement> max = select.getOptions();

        int random = randomNum( max.size()-1 );

        select.selectByIndex( random+1 );

        sleep(1);

    }



    public void verifyURL(String expectedResult){

        sleep( 5 );
        String URL = driver.getCurrentUrl();

        Assert.assertTrue(URL.contains( expectedResult )  );

    }

    //  two numbers and list all the numbers in the list is between two numbers
    public void betweenNumbers(int min , int max , List<WebElement> priceList){

        for(int i = 0 ; i< priceList.size() ; i++){

            String priceSTR = priceList.get( i ).getText();

            double priceDouble = Double.parseDouble( priceSTR );

            if(min<=priceDouble && priceDouble<=max){
                Assert.assertTrue( "number is between the range" , true );

            }else{
                Assert.fail();
            }

        }

    }

    public void hoverOver(WebElement hoveroverElement){
        Actions actions = new Actions( driver );
        actions.moveToElement( hoveroverElement ).build().perform();
        sleep( 5 );
    }

}