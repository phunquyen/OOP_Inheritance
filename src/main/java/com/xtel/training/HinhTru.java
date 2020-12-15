package com.xtel.training;

import java.util.Scanner;

public class HinhTru extends HinhTron{
    // thuoc tinh: chieu cao
    // phuong thuc: nhap ban kinh, nhap chieu cao, tinh the tich
    private float chieuCao;

    protected HinhTru() {
        ten = "Hinh tru";
    }

    protected void nhapChieuCao() {
        nhapBanKinh();
        System.out.print("Moi nhap chieu cao: ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextInt();
    }

    protected void tinhTheTich() {
        theTich = dienTich * chieuCao;
    }
}
