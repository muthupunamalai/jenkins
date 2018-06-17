Feature: Login the testLeaftab

@regression @sanity
Scenario Outline: Login the Leaftab application


Given Enter the username as <username>

And Enter the password as <password>
And Click on the login button
And Click on the CRM/SFA
And Click on the Leads tab
And Click on the create lead
And Enter the company name <company>
And Enter the first name <firstname>
And Enter the last name <lastname>
When Click on the submit buttons
Then Verify whether the lead is created succesfully with the first name and last name


Examples:
|username|password|company|firstname|lastname|
|DemoCSR|crmsfa|cts|dhevdharson|sudharson|
 
 
 @sanity
 Scenario Outline: Login the sumtab application


Given Enter the username as <username>
And Enter the password as <password>
And Click on the login button
And Click on the CRM/SFA
And Click on the Leads tab
And Click on the create lead
And Enter the company name <company>
And Enter the first name <firstname>
And Enter the last name <lastname>
When Click on the submit buttons
Then Verify whether the lead is created succesfully with the first name and last name


Examples:
|username|password|company|firstname|lastname|
|DemoCSR|crmsfa|cts|sudharson|arulgnanam|