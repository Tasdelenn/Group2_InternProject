Feature: Nationality Setup Parameters Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

  @Regression @SetupParametersTest
  Scenario: Add Nationality Parameter
    When Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | Çekoslovakya |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  @Regression @SetupParametersTest
  Scenario: Search and Edit Nationality Parameter
    When User sending the keys in Dialog content
      | searchGeneralName | Çekoslovakya |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | Çekya |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  @Regression @SetupParametersTest
  Scenario: Search and Delete Nationality Parameter
    When User sending the keys in Dialog content
      | searchGeneralName | Çekya |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |
    Then Success message should be displayed

