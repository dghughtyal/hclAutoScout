Feature: Auto Kaufen or Leasing

  @P0
  Scenario: Search Autos to buy
    Given I am on AutoScout Home Page
    When I search for Autos
      | make | model | price    | firstRegistration | location  |
      | Audi | A1    | 20.000 € |              2022 |61184      |
     Then Validate the Result list Page
    
  @P11
  Scenario: AutoScout Logo click navigates user to Home Page
    Given I am on Auto Leasing Angebote Page
    When I click on AutoScout Logo
    Then I navigate to Home page

    