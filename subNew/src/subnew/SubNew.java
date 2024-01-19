/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subnew;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SubNew {

    /**
     * @param args the command line arguments
     */
    public static boolean checkdx(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static boolean check(String s1) {
        int len = s1.length();
        if (checkdx(s1) && len % 2 == 0) {
            return false;
        }
        if (checkdx(s1) && len % 2 == 1) {
            return true;
        }
        int l = 0, r = s1.length() - 1;
        char[] s = s1.toCharArray();
        int cnt = 0;
        while (l <= r) {

            if (s[l] != s[r]) {
                cnt++;
            }
            l++;
            r--;
        }
        return cnt == 1;

    }

    public static String rutgonXau(String s) {
        StringBuilder strb = new StringBuilder(s);
        int i = 0;
        while (i < strb.length() - 1) {
            if (strb.charAt(i) == strb.charAt(i + 1)) {
                strb.delete(i, i + 2);
                if (strb.isEmpty()) {
                    return "Empty String";
                } else {
                    i = -1;
                }
            }
            i++;

        }
//        while (i < strb.length() - 1) {
//            if (strb.charAt(i) == strb.charAt(i + 1)) {
//                strb.delete(i, i + 2);
//                if (strb.isEmpty()) {
//                    return "Empty String";
////                    return;
//                } else {
//                    i = -1;
//                }
//            }
//            i++;
//
//        }
        return strb.toString();

//        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(rutgonXau(sc.nextLine()));

    }

}
