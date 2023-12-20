Feature: Application Login

Scenario: Home page default login 
Given user is on NetBanking landing page
When user login in to application with "jin" and password "123"
Then Home page is poplute
And cards are displayed "true"


Scenario: Home page default login 
Given user is on NetBanking landing page
When user login in to application with "jan" and password "321"
Then Home page is poplute
And cards are displayed "false"


Scenario: Home page default login 
Given user is on NetBanking landing page
When user sign up with the following details
|Naweed|Nh@123@123|Naweed.kpu@gmail.com|USA|2065106757|
Then Home page is poplute
And cards are displayed "false"