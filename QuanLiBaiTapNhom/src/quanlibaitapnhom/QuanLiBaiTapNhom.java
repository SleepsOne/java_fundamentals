/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlibaitapnhom;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author HP
 */


class SinhVien{
    private String ma, ten, sdt, tenNhom;
    private int no_g;
    public static int dem = 1;

    public SinhVien(String ma, String ten, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTenNhom() {
        return tenNhom;
    }

    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    public int getNo_g() {
        return no_g;
    }

    public void setNo_g(int no_g) {
        this.no_g = no_g;
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        SinhVien.dem = dem;
    }

    @Override
    public String toString() {
       return ma + " " + ten + " " + sdt + " " + no_g + " " + tenNhom;
    }
    
    
    
    
    
}
public class QuanLiBaiTapNhom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        Scanner sc3 = new Scanner(new File("NHOM.in"));
        List <SinhVien> list = new ArrayList<>();
        Map <Integer, String> mp = new TreeMap<>();
        int n = Integer.parseInt(sc1.nextLine());
        int m = Integer.parseInt(sc2.nextLine());
        int p = n;
        while (n --> 0){
            list.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        int dem = 1;
        while (m-->0){
            String s1 = sc2.nextLine();
            mp.put(dem++, s1);
        }
        while (p --> 0){
            String s = sc3.nextLine();
            String[] tmp = s.split("\\s+");
            String maa = tmp[0];
            int sttN = Integer.parseInt(tmp[1]);
            for (SinhVien x : list){
                if (x.getMa().equals(maa)){
                    x.setNo_g(sttN);
                    x.setTenNhom(mp.get(sttN));
                }
            }
            
            
        }
        list.sort((o1,o2) -> o1.getMa().compareTo(o2.getMa()));
        list.forEach(System.out::println);
        
        
    }
    
}
