package org.example;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {
    By _TAndCConditionCheckBox = By.cssSelector("input#termsofservice");
    By _checkOutButton = By.cssSelector("button#checkout");
    public void clickOnTermsAndConditionCheckBox(){
        clickOnElement(_TAndCConditionCheckBox);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(_checkOutButton);
    }
}
