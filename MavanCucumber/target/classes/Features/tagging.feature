Feature: Free CRM application testing 

@SmokeTest @FunctionalTest @E2ETest @RegresstionTest
Scenario: login with correct credentials 
	Given login check 
@RegresstionTest @FunctionalTest @E2ETest 
Scenario: Create new deals 
	Given Create new deal test 
@RegresstionTest @FunctionalTest@E2ETest 
Scenario: Create new contacts 
	Given Create new contact test 
@RegresstionTest @FunctionalTest 
Scenario: Search task test 
	Given Search task 
@SmokeTest
Scenario: Create new deals1 -repeated 
	Given Create new deal test1 -repeated 
@FunctionalTest
Scenario: Create new contacts1 
	Given Create new contact1 
@RegresstionTest @E2ETest 
Scenario: Verify left panel links 
	Given Left pannel link check 
@RegresstionTest @E2ETest 
Scenario: Search a call 
	Given Search a call test 
@SmokeTest @E2ETest @RegresstionTest
Scenario: logout check 
	Given logout check 
	
