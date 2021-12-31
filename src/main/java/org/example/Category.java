package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Category extends Utils{
    By _categoryPageTitle = By.xpath("//h1");
    public void verifyCategoryTitle(String pagetitle){
        Assert.assertEquals(driver.findElement(_categoryPageTitle).getText(),pagetitle);
    }
    public void verifyCategoryPageURL(String pageURL){
        Assert.assertTrue(driver.getCurrentUrl().equals(pageURL));
    }
}
