Feature: Delete Lead in Leaf Taps

Scenario Outline: Verify Delete Lead is success in LeafTaps

And Enter uName as <uName>
And Enter pwd as <pwd>
And click Login
And click CRM/SFA
And click Lead
And click Find Lead
And Enter Lead Id as <id>
And click Find lead button
And click ID Link
And click Delete Button
And click Find Lead
And Enter Lead Id as <id>
And click Find lead button
Then Verify No Display Lead Message is Displayed

Examples:
|uName|pwd|id|
|DemoSalesManager|crmsfa|10595|

