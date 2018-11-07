Feature:
	As a user
	I want to be able to add a new client to the system
	So that i can book a flight
	
Scenario: Sign up new user
	Given the user is on landing page
	When he chooses to register
	And he provides the first name as James
	And he provides the last name as Hetfield
	And he provides the phone as 9999999999
	And he provides the email as jfield@aq.com
	And he provides the address as P.O. Box 3700 
	And he provides the city as Eureka
	And he provides the state as California
	And he provides the postal code as 95502
	And he provides the country as United States
	And he provides the user name as jhetfield
	And he provides the password as password
	And he provides the confirm password again as password
	And he signs-up
	Then he should get a welcome message