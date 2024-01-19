/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diemdanh1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */

class SinhVien{
    private String ma, ten, lop, note;
    private int cc;

    public SinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + cc + " "+((note==null)? "" : note);
    }
    
    
}
public class DiemDanh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = n;
        
        List<SinhVien> list = new ArrayList<>();
//        int demHT = 1;
//        int demHP = 1;
        while (n-- > 0) {
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));

        }
        
        
        while (m --> 0){
            String ma = sc.next();
            String cc = sc.next();
            int demv = 0;
            int demm = 0;
            for (char c : cc.toCharArray()){
                if (c == 'm') demm+=1;
                else if (c == 'v') demv += 2;
            }
            int diem = 10 - demm - demv;
            for (SinhVien x : list){
                if (x.getMa().equals(ma)){
                    tinhDiem(x, diem);
                }
            }
            
            
        }
//        list.forEach(System.out::println);
        String key = sc.next();
        for (SinhVien x : list){
            if (x.getLop().equals(key)){
                System.out.println(x);
            }
        }
        
    }
    public static void tinhDiem(SinhVien x, int diem){
        if (diem <= 0){
            diem = 0;
            x.setNote("KDDK");
        }
        x.setCc(diem);
        
    }
    
}
