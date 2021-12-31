Feature: Alert pop-up box
  As an unregistered user when i click on vote button,
  the alert pop-up box should come up, and i can assert the text
  and click on ok.
  @smoke
  Scenario: As an unregistered user i want to click on vote button,and alert pop-up box should appear
    Given User is on the home page
    When  i click on vote
    And user should verify pop up message from alert window
    Then i can handle OK button