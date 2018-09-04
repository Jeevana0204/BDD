Feature: GitHub Registration Feature
@run2
Scenario: User wants to search for using redbus.com
Given User will be on the homepage of redbus
When User enters valid source,destination and onward date
Then all buses available on that particular day will be displayed 
