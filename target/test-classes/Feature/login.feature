#Author: Anju Panwar

Feature: Login with stores credential
 
Scenario: Login with valid email id and password
Given I visit the website of rapid as a admin
When Click on the login button to redirect on sign in page
And Enter username and password
Then click on signin button
And select the store from child store list
But I redirect on the Overview page