# TestAutomation - Assigment

# Cucumber Feature: Successfull user registration
# Scenarios:
  @Regression @smoketesting @p3
# Scenario: user should not be able to register with invalid email
# Given user is on homepage
# 	When user navigates to create account Page
# 	And user enters invalid email address
	# 	And user click on create an account
	# 	Then user see an error message for invalid email	
		
  @Regression @signup @smoketesting @sanitychecks @p1
	# Scenario: user should be able to register with valid email address
    	# 	Given user is on create account page
	# 	When user adds personal details
	# 	And user clicks on register button
	# 	Then user is successfully registored
