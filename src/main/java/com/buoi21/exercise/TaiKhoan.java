package com.buoi21.exercise;

import java.util.Date;

public class TaiKhoan {
    private long maTK;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private double soDu = 50.000;

    public TaiKhoan() {
    }

    public long getMaTK() {
        return maTK;
    }

    public void setMaTK(long maTK) {
        this.maTK = maTK;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public TaiKhoan(long maTK, String hoTen, Date ngaySinh, String gioiTinh, double soDu) {
        this.maTK = maTK;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return "TaiKhoan[" +
                "maTK=" + maTK +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDu=" + soDu +
                ']';
    }

    public double kiemTraSoDu(){
        return getSoDu();
    }
}
