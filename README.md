## TestAutomation - Assigment

## Feature: 
Successfull user registration

  @Regression @smoketesting @p3
# Scenario: user should not be able to register with invalid email
	#	Given user is on homepage
	#	When user navigates to create account Page
	#	And user enters invalid email address
	# 	And user click on create an account
	# 	Then user see an error message for invalid email	
		
  @Regression @signup @smoketesting @sanitychecks @p1
# Scenario: user should be able to register with valid email address
	#	Given user is on create account page
	# 	When user adds personal details
	# 	And user clicks on register button
	# 	Then user is successfully registored


## How to run this application

# Clone the git repo using following command

```git clone https://github.com/gurinderskarwal/TestAutomation.git```

# Compile the application

```
cd testautomation
mvn clean compile
```
	
# Run the application
	
```mvn test ```
	
Make sure chromedriver executable (chromedriver.exe for windows e.g.) is in your system path.

This should open the browser and will do the required steps.

Once tests are run report (report.html) will be availbale in target/cucumber-reports
