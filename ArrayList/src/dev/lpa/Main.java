package dev.lpa;


import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.binarySearch;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(List.of(1, 2, 3, 4 ,5));
        al.remove(1);
        al.remove(Integer.valueOf(1));
        System.out.println(al);
        al.retainAll(List.of(2, 3, 4));
        System.out.println(al);
        al.clear();
        System.out.println(al);
//        int a = ColebinarySearch
//                ()
        ArrayList<String> arl = new ArrayList<>(List.of("a", "b", "c"));
        String[] strAr = arl.toArray(new String[0]);
        for (var x : strAr){
            System.out.print(x + " ");
        }

    }
}
