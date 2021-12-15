Feature: User should able to refer a product to a friend
  As a user, i want to email
  so that, i can refer a product to a friend.
  @test
  Scenario: User should able to refer a product to a friend
    Given user is already registered successfully
    When  user selects a product
    And click on email a friend button
    And  user enters the friend's email and message
    And  user clicks on send email button
    Then user should be able to refer a product to a friend
