Feature: Login to User Account Check

@P22
Scenario: User Logs in
Given I am on AutoScout Home Page
When I pass 'dghughtyal@gmail.com' and 'Autoscout@123' to login
Then User navigates to My account Page