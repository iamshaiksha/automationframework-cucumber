Feature: Test Fundoonote Registration smoke scenario

	@SmokeTest 
  Scenario: Test Fundoonote Registration valid Credentials
    Given open chrome and start application
    When I entered name "shaiksha" email "iamshaiksha2019@gmail.com" password "Shaiksha@123" mobilenumber "7993374636"
    Then user should be able to login successfully