package org.example;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AlertPopUpBox extends Utils {
    public void verifyAlertMessageFromPopUpWindow(){
        //verifying the text from the alert window
        Assert.assertEquals(driver.switchTo().alert().getText(),loadProp.getProperty("expectedPopUpMessage"));
    }
    public void handleOkButton(){
        //clicking on ok
        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
}