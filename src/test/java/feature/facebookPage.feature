Feature: verify the URL in another tab
  As a user when i click on Facebook button on homepage,
  it should open the facebook page from homepage,verify the URL in another tab.
  @smoke
  Scenario: As a user when i click on Facebook button on homepage,
  i should be able to verify the Facebook URL in another tab
    Given User is on the home page
    When user click on the facebook button
    Then  user should able to verify it has open into another tab with the URL
