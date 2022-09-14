Feature: Fields Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fields     |

  @Regression @SetupParametersTest
  Scenario:Create Fields
    When Click on the element in the Dialog
      | addButtonField |
    And User sending the keys in Dialog content
      | nameInput | fieldNew |
      | codeInput | 2323     |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  @Regression @SetupParametersTest
  Scenario:Edit Fields
    When Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | fieldNewest |
      | codeInput | 4545        |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  @Regression @SetupParametersTest
  Scenario:Delete Fields
    When User search and delete item from Dialog
      | fieldNewest |
    Then Success message should be displayed
