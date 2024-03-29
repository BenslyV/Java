Feature: Free CRM Login Feature

  # Data Driven without using Example Keyword
  #Scenario: Free CRM Login Test Scenario
  #Given user is already on Login Page
  #When title of login page is Free CRM
  #Then user enters "bensly.v@gmail.com" and "Rohit12#"
  #Then user clicks on login button
  #Then user is on home page
  #Then Close the browser
  #Data Driven by using Example Keyword and Outline Scenerio
  Scenario Outline: Free CRM Login Test Scenario
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then Close the browser

    Examples: 
      | username           |  | password |
      | bensly.v@gmail.com |  | Rohit12# |
