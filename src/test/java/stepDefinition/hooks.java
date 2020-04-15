package stepDefinition;

import cucumber.api.java.After;
import utilities.Driver;

public class hooks {


    @After
    public  void afterMethod(){
        Driver.closeDriver();
    }
}
