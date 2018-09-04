Feature: Google Search Feature
This feature is used to explore various sites


@google
Scenario: User want to search information about 'Agile methodology' by entering valid set of words
Given User is on google homepage
When User searches for 'Agile methodology' term
Then All pages linked with 'Agile methodolgy' should be displayed
