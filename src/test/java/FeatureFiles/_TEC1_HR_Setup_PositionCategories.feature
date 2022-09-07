Feature: Human Resources Position Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression @HumanResourcesTest
  Scenario: Create, Edit And Delete a Position Category
    And Click on the element in the left Nav
      | humanResources     |
      | hrSetup            |
      | positionCategories |

    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | Management |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

    Then User sending the keys in Dialog content
      | searchInput | Management |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | Teachers |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

    Then User sending the keys in Dialog content
      | searchInput | Teachers |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |
    And Success message should be displayed














