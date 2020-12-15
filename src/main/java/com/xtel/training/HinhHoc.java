package com.xtel.training;

public class HinhHoc {
    // thuoc tinh: ten, chu vi, dien tich, the tich
    // phuong thuc: hinh hoc, xuat ten, in chu vi, in dien tich, in the tich
    protected static float PI = 3.14f;
    protected String ten;
    protected float chuVi;
    protected float dienTich;
    protected float theTich;

    protected void xuatTen() {
        System.out.println("Ten hinh: " + ten);
    }

    protected void inChuVi() {
        System.out.println("Chu vi = " + chuVi);
    }

    protected void inDienTich() {
        System.out.println("Dien tich = " + dienTich);
    }

    protected void inTheTich() {
        System.out.println("The tich = " + theTich);
    }
}
