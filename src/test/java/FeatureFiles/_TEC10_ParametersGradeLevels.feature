Feature: Grade Levels Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression @SetupParametersTest
  Scenario: Create, Edit And Delete a Grade Levels
    And Click on the element in the left Nav
      | setupOne    |
      | parameters  |
      | gradeLevels |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | Software Test |
      | shortName | swftTest      |
      | order     | 1             |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

    And Click on the element in the Dialog
      | editButton3 |
    And User sending the keys in Dialog content
      | nameInput | Cucumber Testing |
      | shortName | Cucumber         |
      | order     | 1                |

    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

    And User delete third item from Dialog
    Then Success message should be displayed