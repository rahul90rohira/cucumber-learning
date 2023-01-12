Feature: Search and place the order for Products

  Scenario: Search Experience on Home and Deals page
    Given User is on landing page
    When User search the vegetable with short name "Tom" and extracted actual name of product
    Then user search for same shortname "Tom" in offers page to check if product exist
    And  verify product name in offers page matches with landing page


