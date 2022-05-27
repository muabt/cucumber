Feature: test hinh chu nhat

  Scenario: tinh dien tich
    Given khoiTaoHinhChuNhat
    And coChieuDai 5.12
    And coChieuRong 6.53
    When tinhDienTich
    Then ketQuaBang 33.433

  Scenario Template:
    Given khoiTaoHinhChuNhat
    And coChieuDai <chieuDai>
    And coChieuRong <chieuRong>
    When tinhChuVi
    Then ketQuaBang <chuVi>

    Scenarios:
      | chieuDai | chieuRong | chuVi |
      | 5        | 6         | 22    |
      | 4        | 4.5       | 17    |