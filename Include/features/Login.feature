Feature: Login feature
Scenario Outline: User successfully login

Given User navigate to login page
When User enter <username> and <password>
And User clicks on login button
Then User redirected to homepage

Examples: 
|username|password|
|Admin|hUKwJTbofgPU9eVlw/CnDQ==|