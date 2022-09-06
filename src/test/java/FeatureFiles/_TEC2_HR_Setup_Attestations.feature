Feature: Human Resources Attestations

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create, Edit And Delete a Attestations
    And Click on the element in the left Nav
      | humanResources |
      | hrSetup        |
      | attestations   |

    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | Ali Onay |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

    Then User sending the keys in Dialog content
      | searchInput | Ali Onay |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | Veli Onay |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

    Then User sending the keys in Dialog content
      | searchInput | Veli Onay |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |
    And Success message should be displayed














