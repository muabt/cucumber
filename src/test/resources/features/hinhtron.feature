Feature: test HinhTron
  Scenario:
    Given khoiTaoHinhTron
    And kichThuocBang 2.34
    When tinhChuViHinhTron
    Then ketQuaBangHT 14.69

  Scenario:
    Given khoiTaoHinhTron
    And kichThuocBang -1
    When tinhDienTichHinhTron
    Then nemRa RuntimeException
    And noiDung banKinhPhaiDuong
