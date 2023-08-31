Feature: Login Functionality

  @SmokeTest @Regression
  Scenario: Login with valid username and password

    Given Navigate to Guru
    When Enter valid UserID and Password and click login button
    Then User should login successfully
