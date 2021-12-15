Feature: New Release Page
  As a user, I want to add a new comment on demoNopCommerce website
  so that, i can post my comment successfully.
  @test
  Scenario: User should be able to add a comment successfully

    Given user is on the nopCommerce details page
    When user enters title and comment
    And  click on the new comment button
    Then user should be able to add a comment successfully