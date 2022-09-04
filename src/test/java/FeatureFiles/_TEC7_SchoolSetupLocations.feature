Feature: School Setup Locations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create School Locations
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |
    And Click on the element in the Dialog
      | addButton       |
      | classroomSelect |
      | other           |
    And User sending the keys in Dialog content
      | nameInput | canteen |
      | shortName | cntn    |
      | capacity  | 50      |
    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | library |
      | shortName | lbry    |
      | capacity  | 500     |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

    And Click on the element in the Dialog
      | slideToggle |
    Then Success message should be displayed

    And User delete item from Dialog
    Then Success message should be displayed