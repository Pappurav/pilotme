Feature: Search Glass

Scenario Outline: Verify Product Name and price of the selected glass

#Given Open the Browser
#And Load Url
#Enter uName as (.*)
And enter in Search field as <pName>
And find Unisex Glass and flat 40%
And select Green Color option from Colour
And select second displayed product
And get Product Name
And get Product Price 
And click AddtoBag
And click GotoBag
And verify selected product's name
And verify selected product's price


Examples:
|pName|
|SunGlasses|


