package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils{
    By _registerLinkButton = By.xpath("//a[@class='ico-register']"); //click on register button on home page
    By _clickingComputers = By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a"); //click on computer menu
    By _detailsButton = By.xpath("//div[@class='news-items']/div[2]/div[3]/a");//Click on Details button
    By _voteButton = By.cssSelector("button#vote-poll-1");
    By _faceBookButton = By.xpath("//li[@class='facebook']/a");
    By _detailsButtonOnlineStore = By.xpath("//div[@class='news-items']/div[1]/div[3]/a");
    By _homePage = By.xpath("//div[@class='header-logo']/a");
    public  void clickOnRegisterButton() {
        clickOnElement(_registerLinkButton);
    }

    public void clickOnComputersMenu(){
        clickOnElement(_clickingComputers);
    }

    public void clickOnNewsDetailsButton(){
        clickOnElement(_detailsButton);
    }
    public void clickOnCategory(String category){
        clickOnElement(By.linkText(category));
        WebElement element = driver.findElement(By.linkText(category));
        String beforeHover = element.getCssValue("color");
        System.out.println("Before hover:  " +beforeHover);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        WebElement afterHover = driver.findElement(By.linkText(category));
        String after = element.getCssValue("color");
        System.out.println("After hover:  " + after);
        Assert.assertTrue(after.equals(loadProp.getProperty("afterColor")));
    }
    public void clickOnSubCategory(String sub_category){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.linkText(sub_category));
        action.moveToElement(element).build().perform();
        element.click();
    }
    public void userClickOnVoteButton(){
        clickOnElement(_voteButton);//click on vote button from homepage
    }
    public void userClickOnFacebookButton(){
        clickOnElement(_faceBookButton);//click on the facebook button link to open in new tab
    }
    public void userIsOnHomePage(){
        clickOnElement(_homePage);
    }
    public void clickOnTheDetailsButton(){
        clickOnElement(_detailsButtonOnlineStore);
    }
}