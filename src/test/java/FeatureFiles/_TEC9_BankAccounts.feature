Feature: Bank Account Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario:Create Bank Account
    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |
    And Click on the element in the Dialog
      | addButton    |
      | currencyMenu |
      | euro         |
    And User sending the keys in Dialog content
      | nameInput        | TechnoStudy |
      | ibanInput        | TR214123    |
      | integrationCode2 | 2546455     |
    And Click on the element in the Dialog
      |saveButton|
    Then Success message should be displayed

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | nameInput        | Study  |
      | ibanInput        | TR6643 |
      | integrationCode2 | 656656 |

    And Click on the element in the Dialog
      |saveButton|
    Then Success message should be displayed

    And User search and delete item from Dialog
      | Study |
    Then Success message should be displayed





