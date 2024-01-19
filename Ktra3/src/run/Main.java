/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        QuanLyTV q=new QuanLyTV();
        Scanner in=new Scanner(System.in);
        q.nhapTapChi(in);
        q.nhapSach(in);
        q.out();
    }
    
}






