Feature: Validation of login page in Adactin web application



  Scenario: TC01_validation of login page with valid credentials
  	Given User is on login page
    When User enter valid user name and password
    And user click on login button
    Then verified home page is displayed
    
    Then user select preffered location
    When user select preffered hotel
    And user select preffered room type
    Then user select Number of Rooms
    Then user select checkin date
    Then user select checkout date
    When user select number of adults per room
    Then user select number of children per room
    Then user click on search button
    And user click on radio button
    Then user click on continue
    Then user enter first name of username in tab
    Then user enter last name of username in tab
    Then user enter billing address in tab
    When user enter CC number in tab
    Then user select Card type in dropdown
    And user select expiry month of Credit card
    Then user select expiry year of Credit card
    Then user enter CVV number in tab
    And verified  order number is displayed
