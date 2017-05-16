Feature: An user must be able to register as a Nabca User

  Scenario: Requesting acces as a supplier
    When the user is on the loginPage
  And click request access tab
  And enter the details of FirstName LastName Email and phone number

    And check the radio Button Named I am a Supplier
    And Check the states Idaho and Montana
    And Select a Suppplier name
    And enter a Supplier address
    And enter the city
    And Select the state
    And enter the zipcode
    And select the country as United Staes
    And Register

  Scenario: Requesting acces as a Broker

    When the user is on the loginPage
    And click request access tab
    And enter the details of FirstName LastName Email and phone number

    And check the radio Button Named I am a Broker
    And Check the states Idaho and Montana
    And Select a Suppplier name
    And enter a Supplier address
    And enter the city
    And Select the state
    And enter the zipcode
    And select the country as United Staes
    And Enter the companyName
    And enter the company address
    And enter the company city
    And Select the company state
    And Enetr the company Zip
    And Register



