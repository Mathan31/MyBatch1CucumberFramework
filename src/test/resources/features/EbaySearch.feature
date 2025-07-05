Feature: Ebay Product Search Validation

Background: Pre-Condition for Ebay Search

 Given I Navigate to Ebay URL
	
	@Smoke
  Scenario: Ebay Search with Hardcoded value from Step Definition file
 
  When I Enter the product name and selected the product catagory
  And I click on Search button
  Then I validate the search result
  And I close the browser

  
  Scenario Outline: Ebay Search with multiple values from Feature file using Scenario Outline with Examples
  Given I Open prefered list of Browser values based on <BrowserType>
  And I Navigate to Ebay URL
  When I Enter the multiple product name as <ProductName> and selected the multple product catagory as <ProductCatagory>
  And I click on Search button
  Then I validate the search result
  And I close the browser
  
  Examples:
  | BrowserType | ProductName | ProductCatagory           |
  |           1 | Samsung     | Cell Phones & Accessories |
  |           9 | Java        | Books                     |
  
