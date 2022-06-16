Feature: Khach hang su dung dich vu va san pham

#  Scenario Outline: tinh tong chi phi visit
#    Given tao khach hang <c>
#    When khach hang name <name> la member <isMember> loai <memberType> ngay <date> su dung dich vu <serviceExpense> va san pham <productExpense>
#    Then tinh tong chi phi cho khach hang la <totalExpense>
#
#    Examples:
#      | name       | isMember | memberType | date       | serviceExpense | productExpense | totalExpense |
#      | John       | TRUE     | GOLD       | 1/1/2022   | 500            | 400            | 785          |
#      | Jame       | FALSE    |            | 10/10/2021 | 499.99         | 349.99         | 849.98       |
#      | Emily      | TRUE     | PREMIUM    | 5/10/2021  | 799            | 567.999        | 1150.399     |
#      | Jessica    | TRUE     | PREMIUM    | 5/1/2022   | 799            |                | 639.2        |
#      | Brian      | FALSE    |            | 7/1/2022   | 899.99         |                | 899.99       |
#      | Hiddleston | TRUE     | SILVER     | 10/10/2020 | 789            | 199            | 889.2        |889




#  Phan loai khach hang thanh vien va khong la thanh vien

  Scenario Outline: khach hang la member
    Given khach hang <hoTen>
    And la thanh vien <loaiThanhVien>
    And ngay thanh toan la <ngayThanhToan>


    And co phi dich vu la <phiDichVu>
    And co phi san pham la <phiSanPham>
    When tinh tong tien phai tra
    Then so tien phai tra la <tongTien>

    Scenarios:
      | hoTen      | loaiThanhVien | ngayThanhToan | phiDichVu | phiSanPham | tongTien |
      | John       | GOLD          | 1/1/2022      | 500       | 400        | 785      |
      | Emily      | PREMIUM       | 10/10/2021    | 799       | 567.999    | 1150.399 |
      | Jessica    | PREMIUM       | 5/10/2021     | 799       | 0          | 639.2    |
      | Hiddleston | SLIVER        | 5/1/2021      | 789       | 199        | 889.2    |


  Scenario Template: khach hang khong la member
    Given khach hang <hoTen>
    And ngay thanh toan la <ngayThanhToan>
    And co phi dich vu la <phiDichVu>
    And co phi san pham la <phiSanPham>
    When tinh tong tien phai tra
    Then so tien phai tra la <tongTien>

    Examples:
      | hoTen | ngayThanhToan | phiDichVu | phiSanPham | tongTien |
      | Jame  | 10/10/2021    | 499.99    | 349.99     | 849.98   |
      | Brian | 7/1/2022      | 899.99    | 0          | 899.99   |



