Feature: Edit Lead
@Sanity
Scenario Outline: Edit Lead Positive

#Given Open the Browser
#And Load Url
#Enter uName as (.*)
And Enter uName as <uName>
And Enter pwd as <pwd>
And click Login
And click CRM/SFA
And click Lead
And click Find Lead
And enter First Name <fName>
And click Find lead button
And click ID Link
And click Edit button
And clear Company Name
And Enter Company Name <cName>
When click Update
Then verify Updated Company Name <vcName>


Examples:
|uName|pwd|fName|cName|vcName|
|DemoSalesManager|crmsfa|test|Cognizant|Cognizant|


