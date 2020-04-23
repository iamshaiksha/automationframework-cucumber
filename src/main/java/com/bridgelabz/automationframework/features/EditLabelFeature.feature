Feature: Test for creating labels operations smoke scenario

	@SmokeTest 
  Scenario: TestLogin valid Credentials and navigate to dashboard and create label
    Given open chrome and start application for creating label
    When I entered email "iamshaiksha2019@gmail.com" and valid "Shaiksha@123"
    Then user should be able to login successfully 
    And after login navigate to dashboard tap on mainmenu
    When  entered on edit label dailobox will popup in that create label
    Then click on done label created successfully