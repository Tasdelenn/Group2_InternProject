Feature: HR Positions Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create, Edit And Delete a HR Position
    And Click on the element in the left Nav
      | humanResources |
      | hrSetup        |
      | positions      |

    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | Mentoring |
      | shortName | ment      |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed
    And Click on the element in the Dialog
      | slideToggle |

    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | Teaching |
      | shortName | tea      |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed
    And Click on the element in the Dialog
      | slideToggle |
    Then Success message should be displayed

    And User delete item from Dialog
    Then Success message should be displayed


