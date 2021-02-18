Feature: SmartBear order process
  @SmartLogin
  Scenario: SmartBear Login
    Given User on the SmartBear login page
    When User enter "Username" and "Password"
    Then User should be on Web order Page


  @wip
  Scenario Outline:
    Given tester login using "Tester" and "test" and click login button
    When tester click order button
    And tester select "<product>" from product dropDown
    And tester enters "<quantity>" to quantity
    And tester enters "<costumer name>" to costumer name
    And tester enters "<street>" to street
    And tester enters "<city>" to city
    And tester enters "<state>" to state
    And tester enters "<zip>" to zip
    And tester select "<cardType>" as card type
    And tester enters "<card number>" to card number
    And tester enters "<expiration date>" to expiration date
    And tester click process button
    Then tester verify "<expectedName>" is in the list
    Examples:
      | product     | quantity | costumer name   | street      | city    | state | zip   | cardType | card number  | expiration date | expectedName    |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago | IL    | 60004 | Visa     | 313313133315 | 12/22           | Ken Adams       |
      | FamilyAlbum | 4        | Joey Tribbiani  | State st    | Chicago | IL    | 60656 | Visa     | 123433533336 | 11/22           | Joey Tribbiani  |
      | ScreenSaver | 1        | Rachel Green    | Michigan st | Chicago | IL    | 60056 | Visa     | 335333333337 | 10/22           | Rachel Green    |
      | MyMoney     | 1        | Chandler Bing   | Erie st     | Chicago | IL    | 60666 | Visa     | 433353333338 | 10/22           | Chandler Bing   |
      | FamilyAlbum | 1        | Dr DrakeRamoray | Dale st     | Chicago | IL    | 60452 | Visa     | 532333335334 | 10/22           | Dr DrakeRamoray |
      | ScreenSaver | 1        | Monica Geller   | Euclid st   | Chicago | IL    | 60312 | Visa     | 733533333333 | 10/22           | Monica Geller   |
      | MyMoney     | 1        | Ross Geller     | River st    | Chicago | IL    | 60666 | Visa     | 833435363732 | 10/22           | Ross Geller     |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago | IL    | 60312 | Visa     | 933533333531 | 12/22           | Ken Adams       |