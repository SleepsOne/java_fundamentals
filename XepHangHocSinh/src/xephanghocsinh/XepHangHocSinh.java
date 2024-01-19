/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xephanghocsinh;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
class Student {

    private String ten, ma, xepLoai;
    private double diemTb;
    public static int dem = 1;
    private int rank;
    private DecimalFormat df = new DecimalFormat("#.#");
    

    public Student(String ten, double diemTb) {
        ma = "HS" + String.format("%02d", dem++);
        this.ten = ten;
        this.diemTb = diemTb;
        if (diemTb > 9) {
            xepLoai = "Gioi";
        } else if (diemTb > 7) {
            xepLoai = "Kha";

        } else if (diemTb > 5) {
            xepLoai = "Trung Binh";

        } else {
            xepLoai = "Yeu";
        }
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }
    
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + df.format(diemTb) + " " + xepLoai + " " +rank;
    }
    

}

public class XepHangHocSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <Student> list = new ArrayList<>();
        
        while (n --> 0){
            list.add(new Student(sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
//        List <Student> list1 = new ArrayList<>(list);
//        Collections.sort(list1, (o1, o2) -> Double.compare(o1.getDiemTb(), o2.getDiemTb()));
        TreeSet <Double> set = new TreeSet<>();
        int cnt = 1;
//        int dem = 0;
        for (Student x : list){
            set.add(x.getDiemTb());               
        }
        Iterator <Double> it = set.descendingIterator();
        while (it.hasNext()){
            double key = it.next();
            int dem = 0;
            for(Student x : list){
                if (Double.valueOf(x.getDiemTb()).equals(key)){
                    dem++;
                    x.setRank(cnt);
                }
                
            }
            cnt+=dem;
              
        }
        for (Student x : list){
            System.out.println(x);
        }
    }
        
        
}


