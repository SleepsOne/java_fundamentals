/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangthunhapgiaovien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
class GiaoVien {

    private String ma, ten;
    private int luong, heso, phucap;

    public GiaoVien(String ma, String ten, int luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
        heso = Integer.parseInt(ma.substring(2));
        phucap = getPhuCap();
    }

    public int getPhuCap() {
        switch (ma.substring(0, 2)) {
            case "HT":
                return 2_000_000;
            case "HP":
                return 900_000;
            default:
                return 500_000;
        }
    }

    public String getMa() {
        return ma;
    }

    public int getTotal() {
        return heso * luong + phucap;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + heso + " " + phucap + " " + getTotal();
    }

}

public class BangThuNhapGiaoVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<GiaoVien> list = new ArrayList<>();
        int demHT = 1;
        int demHP = 1;
        while (n-- > 0) {
            list.add(new GiaoVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));

        }
        for (GiaoVien x : list) {
            if (x.getMa().substring(0, 2).equals("HT") && demHT == 1) {
                System.out.println(x);
                demHT++;
            } else if (x.getMa().substring(0, 2).equals("HP") && demHP <= 2) {
                System.out.println(x);
                demHP++;
            } else if (x.getMa().substring(0, 2).equals("GV")) {
                System.out.println(x);

            }
        }

    }

}
