package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][][] arr2 = new int[4][4][4];

//        for (int i = 0; i < arr2.length; i++){
//            var innerArr= arr2[i];
//            System.out.println(Arrays.toString(innerArr));
//        }
        System.out.println(Arrays.deepToString(arr2));




        long a = 3;
        int b = (int)a;
        System.out.println(b);

        Object ar = new String("a");
        System.out.println(ar.toString());
        String ab = (String) new Object();
        System.out.println(ab);




    }


}
