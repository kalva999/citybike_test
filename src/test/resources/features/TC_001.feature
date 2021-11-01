@api
Feature: Verify City details in Country

  Scenario Outline: Verify city details in country
    Given the <City>
    When user get /v2/networks
    Then user should see http status code as 200 Ok
    Then user should see <City> in <Country>
    And location details contains latitude and longitude

    Examples:
      |City      |Country |
      |Frankfurt |Germany |

