Feature: Test Dashboard operations smoke scenario

	@SmokeTest 
  Scenario: TestLogin valid Credentials and navigate to dashboard and create note
    Given open chrome and start application
    When I entered email "iamshaiksha2019@gmail.com" and valid "Shaiksha@123"
    Then user should be able to login successfully
    And after login navigate to dashboard tap on note 
    When i entered title "cucumber testcase" and description "automation testcase"
    Then click on close note created successfully