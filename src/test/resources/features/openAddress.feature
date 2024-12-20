Feature: OpensAddress

  Scenario Outline: Open multiple address
    Given opens "<pages>"
    When search page
    Then close page

    Examples:
      |pages|
      |http://facebook.com|
      |http://twitter.com|