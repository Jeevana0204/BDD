Feature: Amazon Search Feature
@Execute
Scenario: User want to search information about 'Redmi note 4' by entering valid set of words
Given User is on amazon homepage
When User searches for 'Redmi note 4'
Then all mobiles linked with 'Redmi note 4' will be displayed
@Execute

Scenario: User want to search irrelevant information
Given User is on amazon homepage
When there is no availabilty for a particular search
Then it should display that your search did not match any products