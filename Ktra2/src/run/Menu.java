/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.QLTV;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Menu {
    public static void main(String[] args) {
        QLTV q = new QLTV();
//        String 
        
        while (true) {
            System.out.println("""
                               1. nhap sach
                               2. nhap bao
                               3. hien thi
                               4. luu vao file
                               5. doc tu file
                               6. xoa
                               7. sua
                               8. tim theo ten sach
                               9. tum bao tu nam ... den nam ...
                               
                               
                               0.Thoat
                               """);
            System.out.println("Moi chon(0-9): ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("Bye!!");
                    System.exit(0);
                    break;
                case 1:
                    q.nhapSach();
                    
                    break;
                case 2:
                    q.nhapBao();
                    
                    break;
                case 3:
                    q.hienThiDS();
                    
                    break;
                case 4:
                    q.luu();
                    
                    break;
                case 5:
                    q.docra();
                    
                    break;
                case 6:
                    q.xoa();
                    
                    break;
                case 7:
                    q.sua();
                    break;
                case 8:
                    q.timTheoTenSach();
                    break;
                case 9:
                    q.timBaoTuDenNam();
                    break;
                case 10:
                    q.sapxepSOBanPH();
                    break;
                case 11:
                    q.sapxepSachTheoTenTG();
                    break;
                case 12:
                    q.sapxepBao2TTinh();
                    break;
                
                
            }
        }
    }
    
}
