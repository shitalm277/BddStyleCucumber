package org.example;

import io.cucumber.java.en.And;
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
    Category category = new Category();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    Checkout checkout = new Checkout();
    CheckoutSuccessfully checkoutSuccessfully = new CheckoutSuccessfully();
    AlertPopUpBox alertPopUpBox = new AlertPopUpBox();
    FacebookPageNewTab facebookPageNewTab = new FacebookPageNewTab();
    NewOnlineStore newOnlineStore = new NewOnlineStore();

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

    //Navigate to Category page
    @Given("User is on the home page")
    public void user_is_on_the_home_page() {

    }
    @When("I click on the {string} button")
    public void i_click_on_the_button(String category) {
        System.out.println("Clicking on :"+category);
        homePage.clickOnCategory(category);
    }
    @Then("I should be verified with the {string} and the {string}")
    public void i_should_be_verified_with_the_and_the(String pageUrl, String pageTitle) {
       category.verifyCategoryTitle(pageTitle);
       category.verifyCategoryPageURL(pageUrl);
    }
    @When("I click on {string} button")
    public void i_click_on_button(String sub_category) {
        homePage.clickOnSubCategory(sub_category);
    }



//End to end testing. checkout successfully
    @When("click on Build Your Own Computer item")
    public void click_on_build_your_own_computer_item() {
       desktopPage.clickOnBuildYourOwnComputer();
    }
    @When("select Build it features")
    public void select_build_it_features() {
        buildYourOwnComputer.userSelectBuildItFeatures();
    }
    @When("click on the Add To Cart button")
    public void click_on_the_add_to_cart_button() {
        buildYourOwnComputer.clickOnAddToCartButton();
    }
    @When("user click on shopping cart")
    public void user_click_on_shopping_cart() {
        buildYourOwnComputer.clickOnShoppingCart();
    }
    @When("user click on the terms and conditions checkbox")
    public void user_click_on_the_terms_and_conditions_checkbox() {
        shoppingCartPage.clickOnTermsAndConditionCheckBox();
    }
    @When("user click on checkout button")
    public void user_click_on_checkout_button() {
        shoppingCartPage.clickOnCheckOutButton();
    }
    @When("user enters all the mandatory fields in Billing address")
    public void user_enters_all_the_mandatory_fields_in_billing_address() {
        checkout.entersMandatoryFieldForBillingAddress();
    }
    @When("click on the continue button")
    public void click_on_the_continue_button() {
        checkout.clickOnTheContinueButton();
    }
    @When("user choose the mandatory shipping method option")
    public void user_choose_the_mandatory_shipping_method_option() {
        checkout.shippingMethodOption();
    }
    @When("click on continue button")
    public void click_on_continue_button() {
        checkout.clickOnContinueButton();
    }
    @When("user select the credit card payment method option")
    public void user_select_the_credit_card_payment_method_option() {
        checkout.paymentMethod();
    }
    @When("enter payment card information")
    public void enter_payment_card_information() {
        checkout.cardDetails();
    }
    @And("click on payment continue button")
    public void clickOnPaymentContinueButton() {
        checkout.clickOnPaymentContinueButton();
    }
    @When("user click on confirm button")
    public void user_click_on_confirm_button() {
        checkout.clickOnConfirmButton();
    }
    @Then("user should be able to checkout successfully")
    public void user_should_be_able_to_checkout_successfully() {
        checkoutSuccessfully.verifyUserHasCheckoutSuccessfully();
    }

//click on Vote button

    @When("i click on vote")
    public void i_click_on_vote() {
       homePage.userClickOnVoteButton();
    }
    @When("user should verify pop up message from alert window")
    public void user_should_verify_pop_up_message_from_alert_window() {
        alertPopUpBox.verifyAlertMessageFromPopUpWindow();
    }
    @Then("i can handle OK button")
    public void i_can_handle_ok_button() {
        alertPopUpBox.handleOkButton();
    }

    //click on Facebook button window handling
    @When("user click on the facebook button")
    public void user_click_on_the_facebook_button() {
        homePage.userClickOnFacebookButton();
    }
    @Then("user should able to verify it has open into another tab with the URL")
    public void user_should_able_to_verify_it_has_open_into_another_tab_with_the_url() {
        facebookPageNewTab.userShouldBeAbleToVerifyTheURLInNewTab();
    }



    //add title and comment in New online store is open
    @When("User is on home page")
    public void user_is_on_home_page() {
        homePage.userIsOnHomePage();
    }
    @When("click on the details button of new online store is open under the News")
    public void click_on_the_details_button_of_new_online_store_is_open_under_the_news() {
        homePage.clickOnTheDetailsButton();
    }
    @When("confirm the title New online store is open")
    public void confirm_the_title_new_online_store_is_open() {
        newOnlineStore.confirmTheTitle();
    }
    @When("confirm the title Leave your comment")
    public void confirm_the_title_leave_your_comment() {
        newOnlineStore.confirmTheCommentTitle();
    }
    @Then("user should be able to see the comment in the last of the comment list.")
    public void user_should_be_able_to_see_the_comment_in_the_last_of_the_comment_list() {
        newOnlineStore.verifyNewlyAddedCommentAppearsLastInTheCommentList();
    }
}