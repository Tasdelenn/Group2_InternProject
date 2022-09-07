Feature: Nationality Setup Parameters Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression @SetupParametersTest
  Scenario: Add Nationality Parameter
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    And Click on the element in the Dialog
      | tableAddButton |

    And User sending the keys in Dialog content
      | nameInput | Çekoslovakya |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Search and Edit Nationality Parameter
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    When User sending the keys in Dialog content
      | searchGeneralName | Çekoslovakya |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | nameInput | Çekya |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Search and Delete Nationality Parameter
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    When User sending the keys in Dialog content
      | searchGeneralName | Çekya |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |

    Then Success message should be displayed

