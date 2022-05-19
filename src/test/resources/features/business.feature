Feature: thu nghiem tinh phi visit

  Scenario Outline: tinh tong chi phi visit
    Given tao khach hang <c>
    When khach hang name <name> la member <isMember> loai <memberType> ngay <date> su dung dich vu <serviceExpense> va san pham <productExpense>
    Then tinh tong chi phi cho khach hang la <totalExpense>

    Examples:
      | name       | isMember | memberType | date       | serviceExpense | productExpense | totalExpense |
      | John       | TRUE     | GOLD       | 1/1/2022   | 500.0          | 400.0          | 785.0        |
      | Jame       | FALSE    |            | 10/10/2021 | 499.99         | 349.99         | 849.98       |
      | Emily      | TRUE     | PREMIUM    | 5/10/2021  | 799.0          | 567.999        | 1150.399     |
      | Jessica    | TRUE     | PREMIUM    | 5/1/2022   | 799.0          |                | 639.2        |
      | Brian      | FALSE    |            | 7/1/2022   | 899.99         |                | 899.99       |
      | Hiddleston | TRUE     | SILVER     | 10/10/2020 | 789.0          | 199.0          | 889.2        |



