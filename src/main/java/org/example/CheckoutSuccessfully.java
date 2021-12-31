package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutSuccessfully extends Utils{
    By _actualSuccessMessage = By.xpath("//div[@class='section order-completed']/div/strong");
    public void verifyUserHasCheckoutSuccessfully(){
        //verify expected result is equal to actual result
        String actualCheckoutSuccessMessage = getTextFromElement(_actualSuccessMessage);
        String expectedCheckoutSuccessMessage = (loadProp.getProperty("checkoutSuccessMessage"));
        Assert.assertEquals(actualCheckoutSuccessMessage, expectedCheckoutSuccessMessage);
    }
}
