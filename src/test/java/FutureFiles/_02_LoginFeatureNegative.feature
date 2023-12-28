Feature: Login Functionality

  @SmokeTest @Regression
  Scenario: Login with invalid username and valid password

    Given Navigate to XuClothingNegative
    When Enter invalid Email and valid Password and click login button
    Then User should not login successfully

    And Navigate to XuClothingNegative
    When Enter valid Email and invalid Password and click login button
    Then User should not login successfully

    And Navigate to XuClothingNegative
    When Enter invalid Email and invalid Password and click login button
    Then User should not login successfully