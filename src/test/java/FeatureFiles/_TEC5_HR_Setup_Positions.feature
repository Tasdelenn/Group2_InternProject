Feature: HR Positions Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | humanResources |
      | hrSetup        |
      | positions      |

  @Regression @HumanResourcesTest
  Scenario: Create a HR Position
    When Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | Mentoring |
      | shortName | ment      |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed
    And Click on the element in the Dialog
      | slideToggle |
    Then Success message should be displayed

  @Regression @HumanResourcesTest
  Scenario: Edit a HR Position
    When Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | Teaching |
      | shortName | tea      |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  @Regression @HumanResourcesTest
  Scenario: Delete a HR Position
    When User search and delete item from Dialog
      | Teaching |
    Then Success message should be displayed
