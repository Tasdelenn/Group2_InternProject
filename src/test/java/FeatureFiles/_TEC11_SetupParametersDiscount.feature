Feature: Discounts Setup Parameters Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression @SetupParametersTest
  Scenario: Add Discount Parameters
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | discounts  |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | descriptionInput | scholarship - 10% |
      | codeInput        | sch10             |
      | priorityCode     | 1                 |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Search and Edit Discount Parameters
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | discounts  |

    When User sending the keys in Dialog content
      | searchDescription | scholarship - 10% |
      | searchCode        | sch10             |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | editButton    |

    And User sending the keys in Dialog content
      | descriptionInput | scholarship - 15% |
      | codeInput        | sch15             |
      | priorityCode     | 2                 |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Search and Delete Discount Parameters
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | discounts  |

    When User sending the keys in Dialog content
      | searchDescription | scholarship - 15% |
      | searchCode        | sch15             |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |

    Then Success message should be displayed

