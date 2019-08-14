Feature: Verify if user should be able to register using a valid email address

		@Regression @smoketesting @p3 @signup
  Scenario: user should not be able to register with invalid email
    Given user is on automationpractice homepage
		When user navigates to create account Page
		And user enters invalid email address
		When user click on create an account
		Then user see an error message for invalid email	
		
		@Regression @signup @smoketesting @sanitychecks @p1
	Scenario: user should be able to register with valid email address
    Given user is on automationpractice homepage
		And user navigates to create account Page
		And user enters valid email address
		And user click on create an account
		When user adds personal details
		And user clicks on register button
		Then user is successfully registored