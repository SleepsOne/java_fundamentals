/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tong2dathuc;


import java.util.Scanner;

/**
 *
 * @author HP
 */

class DaThuc{
    Scanner sc = new Scanner(System.in);
    private int[] a;
    public DaThuc(String s){
        String[] sar = s.split("\\+");
//        for (String x : sar){
//            System.out.println(x);
//        }
//        System.out.println(sar[0].substring(sar[0].indexOf('^') + 1));
        int mu_max = Integer.parseInt(sar[0].substring(sar[0].indexOf('^') + 1));
        a = new int[mu_max + 1];
        for (String x : sar){
            int id = Integer.parseInt(x.substring(x.indexOf('^') + 1));
            int val = Integer.parseInt(x.substring(0,x.indexOf('*')));
            a[id] = val;
        }
    }

    public DaThuc(int[] a) {
        this.a = a;
    }
    
    
    public DaThuc tong(DaThuc p){
        int m = a.length;
        int n = p.a.length;
        int tmp = Math.max(m, n);
//        System.out.println(tmp);
        int[] c = new int[tmp];
        for (int i = 0; i < c.length; i++){
            if (i > m - 1){
                c[i] += p.a[i];
            }
            else if (i > n - 1){
                c[i] += a[i];

            }
            else{
                c[i] = a[i] + p.a[i];

            }
        }
        return new DaThuc(c); 
    }

    @Override
    public String toString() {
        String ans = "";
        for (int i  = a.length - 1; i >= 0; i--){
            if (a[i] != 0){
                ans += String.format("%d*x^%d", a[i], i);
                if (i != 0) {
                    ans += '+';
                }
            }

        }
        return ans;
    }
    
           
}
public class Tong2DaThuc {

    /**
     * @param args the command line arguments
     */
    public static void main(
            String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DaThuc p = new DaThuc(sc.nextLine());
        DaThuc q = new DaThuc(sc.nextLine());
        DaThuc m = p.tong(q);
        System.out.println(m);
        
    }
    
}

