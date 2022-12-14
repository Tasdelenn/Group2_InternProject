Feature: Human Resources Attestations

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | humanResources |
      | hrSetup        |
      | attestations   |

  @Regression @HumanResourcesTest
  Scenario: Create a Attestations
    When Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | Ali Onay |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  @Regression @HumanResourcesTest
  Scenario: Edit a Attestations
    When User sending the keys in Dialog content
      | searchInput | Ali Onay |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | Veli Onay |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  @Regression @HumanResourcesTest
  Scenario: Delete a Attestations
    When User search and delete item from Dialog
      | Veli Onay |
    Then Success message should be displayed














