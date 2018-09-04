Feature: GitHub Registration Feature
@run5
Scenario: User wants to register for GitHub account using valid details
Given User will be on the signup page of GitHub
When User enters valid username,email and password
Then GitHub account will be created for the user
@run5
Scenario: User wants to register for GitHub using invalid username
Given User will be on the signup page of GitHub
When User enters invalid username
Then Invalid username will be displayed
@run5
Scenario: User wants to register for GitHub using invalid email
Given User will be on the signup page of GitHub
When User enters invalid email
Then Invalid email will be displayed
@run5
Scenario: User wants to register for GitHub using invalid password
Given User will be on the signup page of GitHub
When User enters passowrd less than 6 characters
Then invalid password will be displayed
@run5
Scenario: User wants to register for GitHub using invalid password
Given User will be on the signup page of GitHub
When User enters password without numbers
Then Invalid password will be dispalyed
