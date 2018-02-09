Feature: the message can be retrieved
  Scenario: client makes call to POST /hello
    When the client adds a new message
    Then the client receives status code of 200
    And the client receives server version Hello World
  Scenario: client makes call to GET /hello
    Given the client retrieves message
    When the client receives status code of 200
    Then the client receives server version Hello World