Feature: Navigate to category list
  @smoke

  Scenario Outline: As a user i want to navigate to the category list accordingly.
    Given User is on the home page
    When  I click on the "<category>" button
    Then  I should be verified with the "<URL>" and the "<page_title>"
    Examples:
      | category    | URL                                      | page_title  |
      | Computers   | https://demo.nopcommerce.com/computers   | Computers   |
      | Electronics | https://demo.nopcommerce.com/electronics | Electronics |
      | Apparel     | https://demo.nopcommerce.com/apparel     | Apparel     |
