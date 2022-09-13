Feature: School Setup Departments Functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | departments |

  @Regression @SetupSchoolTest
  Scenario: Create School Departments
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | student affairs |
      | codeInput | stdntaf         |

    And Click on the element in the Dialog
      | section    |
      | saveButton |
    Then Success message should be displayed

  @Regression @SetupSchoolTest
  Scenario: Edit School Departments
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | university rector |
      | codeInput | unirctr           |
    And Click on the element in the Dialog
      | section    |
      | saveButton |
    Then Success message should be displayed

  @Regression @SetupSchoolTest
  Scenario: Delete School Departments
    And User delete item from Dialog
    Then Success message should be displayed
