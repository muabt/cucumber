package com.buoi21.exercise;

public class TaiKhoanBusiness {
    private TaiKhoan taiKhoan;
    private double napTienTaiKhoan(TaiKhoan taiKhoan, long soTien){
        if(soTien<0){
            throw new RuntimeException("Số tiền không hợp lệ");
        }
        return taiKhoan.getSoDu() + soTien;
    }
    private void chuyenTienDenSoTaiKhoan(TaiKhoan tkChuyen, TaiKhoan tkNhan, long soTien){
        if(soTien > taiKhoan.kiemTraSoDu()){
            throw new RuntimeException("Số tiền trong tài khoản của bạn không đủ");
        }
        return;
    }

}
