Feature: Human Resources Position Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | humanResources     |
      | hrSetup            |
      | positionCategories |

  @Regression @HumanResourcesTest
  Scenario: Create a Position Category
    When Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | Management |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed


  @Regression @HumanResourcesTest
  Scenario: Negative Create a Position Category
    When Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | Management |
    And Click on the element in the Dialog
      | saveButton |
    Then Already Exist message should be displayed

  @Regression @HumanResourcesTest
  Scenario: Edit a Position Category
    When User sending the keys in Dialog content
      | searchInput | Management |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | Teachers |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  @Regression @HumanResourcesTest
  Scenario: Delete a Position Category
    When User search and delete item from Dialog
      | Teachers |
    Then Success message should be displayed













