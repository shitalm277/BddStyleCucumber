package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();
    NewReleasePage newReleasePage = new NewReleasePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    EmailTheProductToAFriend emailTheProductToAFriend = new EmailTheProductToAFriend();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();

    //Registration page
    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
    }
    @When("user enters required registration details")
    public void user_enters_required_registration_details()
    {
        registrationPage.userEntersRegistrationDetails();
    }
    @When("click on register submit button")
    public void click_on_register_submit_button()
    {
        registrationPage.clickOnRegisterButton();
    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully()
    {
        registrationSuccessPage.verifyUserIsOnTheRegisterSuccessPage();
        registrationSuccessPage.verifyUserHasSuccessfullyRegistered();
    }


    //New Release page add comment
    @Given("user is on the nopCommerce details page")
    public void user_is_on_the_nop_commerce_details_page()
    {
        homePage.clickOnNewsDetailsButton();//click on new release details button
        newReleasePage.verifyUserIsOnNewReleasePage();//verify user is on news release page
    }
    @When("user enters title and comment")
    public void user_enters_title_and_comment()
    {
        newReleasePage.userEnterCommentDetails();//type title and comment
    }
    @When("click on the new comment button")
    public void click_on_the_new_comment_button()
    {
        newReleasePage.clickOnNewCommentButton();//click on new comment button
    }
    @Then("user should be able to add a comment successfully")
    public void user_should_be_able_to_add_a_comment_successfully() {
        newReleasePage.userHasAddedNewCommentSuccessfully();//verify user has added new comment successfully.
    }


    //Navigate to desktop page
    @Given("user is on computer page")
    public void user_is_on_computer_page() {
        homePage.clickOnComputersMenu();//click on Computer Menu
        computersPage.verifyUserIsOnComputerPage();//verify user is on Computers Menu page
    }
    @When("user clicks on desktops menu")
    public void user_clicks_on_desktops_menu() {
        computersPage.clickOnDesktopsMenu();//click on desktop menu
    }
    @Then("user should be able to navigate to desktops page successfully")
    public void user_should_be_able_to_navigate_to_desktops_page_successfully() {
        desktopPage.verifyUserIsOnDesktopPage();//verify user is on desktop page
        desktopPage.verifyUserIsShownDesktopMenu();//Verify user is shown desktops menu
    }


    //Refer a product to a friend
    @Given("user is already registered successfully")
    public void user_is_already_registered_successfully() {
        homePage.clickOnRegisterButton();//click on register button
        registrationPage.verifyUserIsOnRegisterPage();//enter URL
        registrationPage.userEntersRegistrationDetails();//entering details in registration page
        registrationPage.clickOnRegisterButton();//clicking on register button
        registrationSuccessPage.verifyUserIsOnTheRegisterSuccessPage();//success page has opened.
        registrationSuccessPage.verifyUserHasSuccessfullyRegistered();//user is registered successfully
    }
    @When("user selects a product")
    public void user_selects_a_product() {
        homePage.clickOnComputersMenu();//click on Computer Menu
        computersPage.verifyUserIsOnComputerPage();//verify user is on Computers Menu page
        computersPage.clickOnDesktopsMenu();//click on desktop menu
        desktopPage.verifyUserIsOnDesktopPage();//verify user is on desktop page
        desktopPage.verifyUserIsShownDesktopMenu();//Verify user is shown desktops menu
        desktopPage.clickOnBuildYourOwnComputer();//Click on Build Your Own Computer
    }
    @When("click on email a friend button")
    public void click_on_email_a_friend_button() {
        buildYourOwnComputer.clickOnEmailAFriend();//click on Email a Friend button
        emailTheProductToAFriend.verifyUserIsOnProductEmailAFriendPage();
    }
    @When("user enters the friend's email and message")
    public void user_enters_the_friend_s_email_and_message() {
        emailTheProductToAFriend.userEntersFriendsEmailAndMessage();//type friends email and personal message
    }
    @When("user clicks on send email button")
    public void user_clicks_on_send_email_button() {
        emailTheProductToAFriend.clickOnSendEmailButton();//click Send email button
    }
    @Then("user should be able to refer a product to a friend")
    public void user_should_be_able_to_refer_a_product_to_a_friend() {
        emailTheProductToAFriend.verifyUserHasSuccessfullySentEmailToAFriend();
    }



}
