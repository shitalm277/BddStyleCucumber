Feature: New Title and Comment should be added successfully
  As a registered user, i want to add title and comment successfully,
  so that i can verify the text.
  @smoke
  Scenario: User should be verified of the confirmation text of the newly added title and comment
    Given user is already registered successfully
    When  User is on home page
    And click on the details button of new online store is open under the News
    And  confirm the title New online store is open
    And confirm the title Leave your comment
    And user enters title and comment
    And click on the new comment button
    And user should be able to add a comment successfully
    Then user should be able to see the comment in the last of the comment list.