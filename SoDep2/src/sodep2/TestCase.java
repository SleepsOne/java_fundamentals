/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sodep2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author HP
 */
public class TestCase {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
        ObjectOutputStream o2 = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
        int[] a1 = {85, 666, 4341};
        int[] a2 = {85, 666, 4431, 85, 11, 1112, 1123};
        ArrayList <Integer> list1 = (ArrayList<Integer>) Arrays.stream(a1).boxed().collect(Collectors.toList());
        ArrayList <Integer> list2 = (ArrayList<Integer>) Arrays.stream(a2).boxed().collect(Collectors.toList());
//        list1.forEach(System.out::println);
//        list2.forEach(System.out::println);
        o1.writeObject(list1);
        o2.writeObject(list2);

        
        
        
    }
    
}
