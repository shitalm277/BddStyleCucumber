package org.example;

import org.openqa.selenium.By;

public class Checkout extends  Utils{
    By _countryDropDown = By.cssSelector("select#BillingNewAddress_CountryId");
    By _city = By.cssSelector("input#BillingNewAddress_City");
    By _address1 = By.cssSelector("input#BillingNewAddress_Address1");
    By _zipPostalCode = By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    By _phoneNumber = By.cssSelector("input#BillingNewAddress_PhoneNumber");
    By _continueButton = By.xpath("//div[@id='billing-buttons-container']/button[4]");
    By _shippingMethodRadioButton = By.cssSelector("input#shippingoption_1");
    By _shippingMethodContinueButton = By.xpath("//div[@id='shipping-method-buttons-container']/button");
    By _creditCardRadioButton = By.cssSelector("input#paymentmethod_1");
    By _paymentMethodContinueButton = By.xpath("//div[@id='payment-method-buttons-container']/button");
    By _creditCardSelector = By.cssSelector("select#CreditCardType");
    By _cardHolderName = By.cssSelector("input#CardholderName");
    By _cardNumber = By.cssSelector("input#CardNumber");
    By _cardExpireMonth = By.cssSelector("select#ExpireMonth");
    By _cardExpireYear = By.cssSelector("select#ExpireYear");
    By _cardCode = By.cssSelector("input#CardCode");
    By _paymentContinueButton = By.xpath("//div[@id='payment-info-buttons-container']/button");
    By _confirmButton = By.xpath("//div[@id='confirm-order-buttons-container']/button");

    public void entersMandatoryFieldForBillingAddress(){
        selectByIndex(_countryDropDown,loadProp.getProperty("Country"));//select the country from the dropdown
        typeText(_city,loadProp.getProperty("City"));//type the city
        typeText(_address1, loadProp.getProperty("Address1"));//type the address 1 text box
        typeText(_zipPostalCode,loadProp.getProperty("ZipPostalCode"));//type the postal code
        typeText(_phoneNumber,loadProp.getProperty("PhoneNumber"));//type the phone number
    }
    public void clickOnTheContinueButton(){
        clickOnElement(_continueButton);//click on shipping address continue button
    }
    public void shippingMethodOption(){
        clickOnElement(_shippingMethodRadioButton);//click on shipping method radio button
    }
    public void clickOnContinueButton(){
        clickOnElement(_shippingMethodContinueButton);//click on continue button
    }
    public void paymentMethod(){
        clickOnElement(_creditCardRadioButton);//click on credit card radio button
        clickOnElement(_paymentMethodContinueButton);// click on continue button
    }
    public void cardDetails(){
        selectByValue(_creditCardSelector,loadProp.getProperty("CardType"));//selecting the card type
        typeText(_cardHolderName, loadProp.getProperty("cardHolderName"));//typing the cardholder name
        typeText(_cardNumber, loadProp.getProperty("cardNumber"));//typing the card number
        selectByValue(_cardExpireMonth,loadProp.getProperty("cardExpireMonth"));//selecting the card expire month
        selectByValue(_cardExpireYear, loadProp.getProperty("cardExpireYear"));//selecting the card expire year
        typeText(_cardCode, loadProp.getProperty("cardCode"));//typing the card code cvv
    }
    public void clickOnPaymentContinueButton(){
        clickOnElement(_paymentContinueButton);// click on continue button for card details
    }
    public void clickOnConfirmButton(){
        clickOnElement(_confirmButton);//click on confirm button
    }
}