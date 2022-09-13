Feature: Subject Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | education         |
      | educationSetup    |
      | subjectCategories |

  @Regression @EducationTest
  Scenario: Create , Edit and Delete Subject Categories
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | QA Engineer |
      | codeInput | SDET        |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  @Regression @EducationTest
  Scenario: Edit a Subject Categories
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | Automation Engineer |
      | codeInput | QA Specialist       |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  @Regression @EducationTest
  Scenario: Delete a Subject Categories
    And User search and delete item from Dialog
      | Automation Engineer |
    Then Success message should be displayed