Feature: Create Lead
@Smoke @Regression
Scenario Outline: Create Lead Positive

#Given Open the Browser
#And Load Url
#Enter uName as (.*)
And Enter uName as <uName>
And Enter pwd as <pwd>
And click Login
And click CRM/SFA
And click Lead
And click Create Lead 
And Enter Comp_Name as <cName>
And Enter First Name as <fName>
And Enter Last Name as <lName>
When Click Create Lead
Then Verify Lead is created successfully as <vName>

Examples:
|uName|pwd|cName|fName|lName|vName|
|DemoSalesManager|crmsfa|Singapore|Krithika|Sunder|Sunder|
|DemoSalesManager|crmsfa|lenova|Yogesh|6000|6000|

