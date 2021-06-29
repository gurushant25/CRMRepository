Feature: Free CRM create contact Feature
Scenario Outline: Free CRM create contact Scenario
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters "<firstname>" and "<lastname>" details
Then Close the browser

Examples:
|     username  |password  |firstname|lastname|
|groupautomation|test@12345|brad     |pitt    |
|groupautomation|test@12345|mama     |kaka|                           