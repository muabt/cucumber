package com.buoi20.demo;

public class MayTinh {
    public long tong(long a, long b) {
        return a + b;
    }
    public double thuong(long a, long b){
        if(b==0){
            throw new RuntimeException("khong the chia cho 0");
        }
        return (double)a/b;
    }
}
