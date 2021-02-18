Feature: Etsy search feature

  @etsy
  Scenario: Etsy default title verification
    Given user is on the  Etsy landing page
    Then user should see Etsy titlr as expected

    #expected: Etsy-Shop for handmade,vintage,custom, and unique gifts for everyone

  Scenario: etsy search title verification
    Given user is on the Etsy landing page
    When user search for wooden spoon
    Then user should see wooden spoon in the Etsy title