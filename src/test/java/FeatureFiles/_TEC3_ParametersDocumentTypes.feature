Feature: Document Types Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create, Edit And Delete a Document Types
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | documentTypes |
    And Click on the element in the Dialog
      | addButton   |
      | matSelect   |
      | examination |
    And click Anywhere
    And User sending the keys in Dialog content
      | nameInput   | Dosya       |
      | description | Files Added |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput   | Klasor       |
      | description | Klasor Added |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

    And User search and delete item from Dialog
      | Klasor |
    Then Success message should be displayed