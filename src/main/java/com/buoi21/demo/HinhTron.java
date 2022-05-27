package com.buoi21.demo;

public class HinhTron {
    private double banKinh;
    private static final double PI = 3.14;

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    public double tinhChuVi(){
        if (banKinh <= 0) throw new RuntimeException("banKinhPhaiDuong");
        double tmp = PI * 2 * banKinh;
        return tmp;
    }
    public double tinhDienTich(){
        if (banKinh <= 0) throw new RuntimeException("banKinhPhaiDuong");
        double tmp = PI * banKinh * banKinh;
        return tmp;

    }
}
