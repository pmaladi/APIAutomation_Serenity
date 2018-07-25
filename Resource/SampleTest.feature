Feature: Google search 
 
Scenario: Google search 
	Given I want to search in Google 
	When I search for 'Serenity BDD' 
	Then I should see link to 'Serenity BDD - Automated Acceptance Testing with Style'
		
Scenario: Google search multiple 
	Given I want to search in Google 
	When I search for '<search_request>' 
	Then I should see link to '<search_result>'
