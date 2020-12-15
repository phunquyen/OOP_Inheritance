package com.xtel.training;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    //thuoc tinh: ban kinh
    //phuong thuc: hinhTron, nhap ban kinh, tinh chu vi, tinh dien tich
    protected float banKinh;

    protected HinhTron() {
        ten = "Hinh Tron";
    }

    protected void nhapBanKinh() {
        System.out.print("Moi nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextInt();
    }
    protected void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    protected void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
