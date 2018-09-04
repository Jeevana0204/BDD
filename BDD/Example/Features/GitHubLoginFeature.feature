Feature: Login feature for Github users

Background: User is already having an account in Github
@reg
Scenario: User is trying to login using invalid username and password
Given User will be on login page of Github
When User enters invalid username and password
Then User cannot login to the github account
@reg
Scenario: User is trying to login using valid username and password
Given User will be on login page of Github
When User enters valid username and password
Then User can login to the github account
