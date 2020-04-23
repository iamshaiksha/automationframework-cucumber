Feature: Test facebook smoke scenario

	@SmokeTest 
  Scenario: TestLogin valid Credentials
    Given open firefox and start application
    When I entered email "iamshaiksha2019@gmail.com" and valid "Shaiksha@123"
    Then user should be able to login successfully
