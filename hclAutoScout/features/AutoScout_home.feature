Feature: AutoScout Home Page Scenarios

  Scenario Outline: AutoScout Country Selector check
    Given I am on AutoScout Home Page
    When I click on '<Country>' from Country selector link
    Then I validate the page navigates to specific url that contains '<Url>' and title contains '<PageTitle>'

    Examples: 
      | Country    | Url                         | PageTitle                                        |
      | Italia     | https://www.autoscout24.it/ | Auto usate                                       |
      | Österreich | https://www.autoscout24.at/ | Gebrauchtwagen und Neuwagen bei AutoScout24      |
      | Nederland  | https://www.autoscout24.nl/ | Occasion of nieuwe auto kopen en gratis verkopen |
      | España     | https://www.autoscout24.es/ | Coches de segunda mano                           |
      | France     | https://www.autoscout24.fr/ | occasion en France                               |
      | Luxembourg | https://www.autoscout24.lu/ | occasion au Luxembourg                           |

  @P1
  Scenario Outline: Check the header link navigation for AutoScout
    Given I am on AutoScout Home Page
    When I click on '<item>' from the header tab '<type>'
    Then I validate Page navigates to specific url and title contains '<title>'

    Examples: 
      | item                 |type      |title                            |
      | Gebrauchtwagen kaufen|Kaufen    |Gebrauchtwagen finden und kaufen |
      | Elektroauto kaufen   |Kaufen    |Elektroauto                      |
      | Auto verkaufen       |Verkaufen |Auto sofort verkaufen            |
      | Motorrad verkaufen   |Verkaufen |Motorrad verkaufen               |