package com.buoi21.demo;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat() {
    }
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double tinhDienTich() {
        return chieuRong * chieuDai;
    }
}

