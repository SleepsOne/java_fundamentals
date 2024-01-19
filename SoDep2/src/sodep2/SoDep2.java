/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sodep2;

import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class SoDep2 {

    /**
     * @param args the command line arguments
     */


    public static boolean check(int n){
        String s = n + "";
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) > s.charAt(i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        var list1 = (ArrayList<Integer>)o1.readObject();
        var list2 = (ArrayList<Integer>)o2.readObject();
        Set<Integer> setTong = new TreeSet<>();
        Map <Integer, Integer> mp1 = new TreeMap<>();
        Map <Integer, Integer> mp2 = new TreeMap<>();
        for (Integer x : list1){
            if (check(x)){
                setTong.add(x);
                mp1.put(x, mp1.getOrDefault(x, 0) + 1);
            }

        }
        for (Integer x : list2){
            if (check(x)){
                setTong.add(x);
                mp2.put(x, mp1.getOrDefault(x, 0) + 1);
            }

        }
        for (Integer x : setTong){
            System.out.println(x + " " + (mp1.get(x)==null ? 0 : mp1.get(x)) + " " + (mp2.get(x)==null ? 0 : mp2.get(x)));
        }

    }
    
}
