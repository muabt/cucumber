Feature: Test Account

  Scenario: tao tai khoan
    Given Khoi tao tai khoan chuyen co ma tai khoan "00055645001" voi name "Bui Thi Mua" co so du ban dau la 100000
    When nap 5000000 vao tai khoan
    Then so du tai khoan sau khi nap la 5100000

  Scenario: Chuyen tien tai khoan success
    Given Khoi tao tai khoan chuyen co ma tai khoan "00055645001" voi name "Bui Thi Mua" co so du ban dau la 5100000
    Given Khoi tao tai khoan nhan co ma tai khoan "00055645002" voi name "Pham Van Tam" co so du ban dau la 100000
    When chuyen 2000000 tien sang tai khoan nhan
    Then so du tai khoan nhan sau khi chuyen la 2100000
    Then so du tai khoan chuyen sau khi chuyen la 3100000

  Scenario: Rut tien tai khoan success
    Given Khoi tao tai khoan chuyen co ma tai khoan "00055645001" voi name "Bui Thi Mua" co so du ban dau la 5100000
    When rut 2000000 tien tu tai khoan chuyen
    Then so du tai khoan chuyen sau khi rut la 3100000

