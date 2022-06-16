Feature: Chuyển đổi nhiệt độ C sang F và ngược lại

  Scenario Outline: Nhiet do
    Given a calculator
    And user input <Input>
    When user click button C to F
    Then result C to F is <C to F>
    When user click button F to C
    Then result F to C is <F to C>

    Examples:
      | Input  | C to F | F to C  |
      | 3.445  | 38.201 | -15.863 |
      | -10.56 | 12.992 | -23.644 |
      | 0      | 32     | -17.777 |
      | 100    | 212    | 37.777  |


