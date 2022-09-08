Feature: Bank Account Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression @SetupParametersTest
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
      | ibanInput        | TR21412355  |
      | integrationCode2 | 2546455555  |
    And Click on the element in the Dialog
      |saveButton|
    Then Success message should be displayed

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | nameInput        | NewStudy   |
      | ibanInput        | TR66431111 |
      | integrationCode2 | 6566561111 |

    And Click on the element in the Dialog
      |saveButton|
    Then Success message should be displayed

    And User search and delete item from Dialog
      | Study |
    Then Success message should be displayed





