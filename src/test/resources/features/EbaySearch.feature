@Complete
Feature: Ebay Search by providing values from diff source

  Background: Ebay Search Pre-Condition
    Given Naviagate to Ebay URL

	@Smoke
  Scenario: Ebay Search with Hardcoded value from step definition file
    When Enter the search product name and product catagory
    And Click on Search button
    Then User should see the search result
    
	@Regression 
  Scenario Outline: Ebay Search with Hardcoded multiple value from feature file
    When Enter the multiple search product name as <productName> and multiple product catagory as <productCatagory>
    And Click on Search button
    Then User should see the search result
		
		@Mobile
    Examples: 
      | productName | productCatagory           |
      | Samsung     | Cell Phones & Accessories |
      | Redmi       | Cell Phones & Accessories |