/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class QuanLyTV {
//    Scanner sc = new Scanner(System.in);
    List <TaiLieu> list;

    public QuanLyTV() {
        list = new ArrayList<>();
    }

    public List<TaiLieu> getList() {
        return list;
    }

    public void setList(List<TaiLieu> list) {
        this.list = list;
    }
    public void nhapTapChi(Scanner in){
        list.add(new TapChi(in.nextLine(), Integer.parseInt(in.nextLine()), in.nextLine()));
        
    }
    public void nhapSach(Scanner in){
        list.add(new Sach(in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        
    }
    public void out(){
        for (TaiLieu i : list){
            if (i instanceof TapChi){
                System.out.println((TapChi)i);
            }
            if(i instanceof Sach) {
                System.out.println(i);
            }
        }
        
    }
    
    
    
    
    
}

