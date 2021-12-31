Feature: Navigate to category list

  @smoke

  Scenario Outline: As a user i want to navigate to the category list accordingly.
    Given User is on the home page
    When  I click on the "<category>" button
    And I click on "<sub_category>" button
    Then  I should be verified with the "<URL>" and the "<page_title>"
    Examples:
      | category    | sub_category   | URL                                       | page_title     |
      | Computers   | Desktops       | https://demo.nopcommerce.com/desktops     | Desktops       |
      | Computers   | Notebooks      | https://demo.nopcommerce.com/notebooks    | Notebooks      |
      | Computers   | Software       | https://demo.nopcommerce.com/software     | Software       |
      | Electronics | Camera & photo | https://demo.nopcommerce.com/camera-photo | Camera & photo |
      | Electronics | Cell phones    | https://demo.nopcommerce.com/cell-phones  | Cell phones    |
      | Electronics | Others         | https://demo.nopcommerce.com/others       | Others         |
      | Apparel     | Shoes          | https://demo.nopcommerce.com/shoes        | Shoes          |
      | Apparel     | Clothing       | https://demo.nopcommerce.com/clothing     | Clothing       |
      | Apparel     | Accessories    | https://demo.nopcommerce.com/accessories  | Accessories    |