package org.example;
import org.testng.Assert;
import java.util.ArrayList;

public class FacebookPageNewTab extends Utils{
    public void userShouldBeAbleToVerifyTheURLInNewTab(){
        //window handling
        //Store all currently open tabs in tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //Switch newly open tab
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains(loadProp.getProperty("facebookPageContains")));
        //perform some operations on newly open tab
        //close newly open tab after performing some operations
         driver.close();
        //switch to old parent tab
        driver.switchTo().window(tabs.get(0));
    }
}
