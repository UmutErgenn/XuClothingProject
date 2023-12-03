Feature: Login Functionality

  @SmokeTest @Regression
  Scenario: Login with valid username and password

    Given Navigate to XuClothing
    When Enter valid Email and Password and click login button
    Then User should login successfully
