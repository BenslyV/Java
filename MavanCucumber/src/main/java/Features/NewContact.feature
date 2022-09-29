Feature: Free CRM new contact creation 


Scenario Outline: Free CRM new contact creation 
	Given user is already on Login Page to cretae new contact 
	When title of login page is Free contact creation 
	Then user enters "<username>" and "<password>" for contact 
	Then user clicks on login button to enter homepage for contact 
	Then user is on home page to create contact 
	Then navigate to contact page and create new contact 
	Then enter "<firstname>" and "<lastname>" 
	Then onece contact created Close the browser 
	
	Examples: 
		| username           |  | password | |firstname| |lastname|
		| bensly.v@gmail.com |  | Rohit12# | |Tata|     |Birla|
		|bensly.v@gmail.com||Rohit12#||Narayana| |Moorthy|
		|bensly.v@gmail.com||failcheck||Bens||Awesome|
