Feature: Add new customer Functionality

    Background:
      Scenario: Login with valid username and password
      Given Navigate to Guru
      When Enter valid UserID and Password and click login button
      Then User should login successfully

  Scenario: Add new customer
    Given Click on the element in the LeftNav
      | newCustomerBtn |

    When User sending the keys in Dialog content
      | nameInput | |serdews|
      | adressInput | |adsdgg|
      | cityInput | |gople|
      | stateInput | |gtre|
      | pinInput | |6987|
      | phoneInput | |5454|
      | mailInput | |kj@gmail.com|
      | passwordInput | |1234|

    And User select from form
      | birth | | 20 |

    And Click on the element in the Dialog
      | genderBox |

    Then Success message should be displayed