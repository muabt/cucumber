Feature: thu nghiem may tinh
  Scenario: thuc hien phep cong
    Given tao mot may tinh
    When tinh tong 5 va 6
    Then ket qua nen bang 11

  Scenario Outline:
    Given tao mot may tinh
    When tinh tong <a> va <b>
    Then ket qua nen bang <c>

    Examples:
    |a|b|c|
    |5|6|11|
    |4|7|11|
    |7|-1|6|

    Scenario:
      Given tao mot may tinh
      When tinh thuong 5 và 0
      Then nem ra exception "RuntimeException"
      And noi dung la "khong the chia cho 0"

#    Scenario Outline:
#      Given tao mot may tinh
#      When tinh thuong <a> va <b>
#      Then ket qua nen bang <c>
#
#      Examples:
#      |a|b|c|
#      |6|2|3|
#      |9|3|3|

