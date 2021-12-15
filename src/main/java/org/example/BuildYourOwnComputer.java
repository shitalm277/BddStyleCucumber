package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils{
    LoadProp loadProp = new LoadProp();
    public void clickOnEmailAFriend()
    {
        clickOnElement(By.xpath("//div[@class='email-a-friend']/button[1]"));
    }
}
