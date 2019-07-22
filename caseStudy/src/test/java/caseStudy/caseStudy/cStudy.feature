
Feature: Title of your feature
  I want to use this template for my feature file
  
  @CS1
    Scenario: Launch Chrome and Load TestMe  
  	Given Login to TestMe App with location "C:\\Users\\test\\Prakash\\chromedriver_win32\\chromedriver.exe" and url "http://192.168.40.4:8083/TestMeApp"
   @CS1
   Scenario: Register To TestMe
  	When I click on SignUp
  	And Provide valid Credentials
  		| userName | fstName 		 | lstName		 | password |confirmPassword | gender |      email 				    |    mobNo   |     dob    |               address            |      securityQuestion      | securityAnswer |
    	| Prasaaaad  | Prasaad		 | prakash		 | 07031998	| 07031998       | Female   |   prasaad@gmail.com   | 9566156465 | 07/03/1998 | no.15 Maran Nagar, Poonamallee   | What is your favour color? |    Yellow     |
    Then Click on Register	
    	
    @CS2
    Scenario: Login to TestMe
    When I click on Sigin
    And I provide userName "Prasaad"
    And I provide Password "07031998"
    And I click on Login	
    
    @CS4
    Scenario: The one where the user moves to cart withoput adding any item in it
    Given Alex has registered into TestMeApp
    When Alex search a particular product like headphones
    And try to proceed to payment without adding any item in the cart
    Then TestMeApp dosen't display the cart icon 
    

