/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambdaexperssion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author HP
 */
public class LambdaExperssion {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
//        Scanner sc = new Scanner(new File ("VANBAN.in"));
        List <String> list = new ArrayList <>(List.of("a", "b", "c"));
        list.forEach(name -> System.out.println(name)); 
        
    }
    
}
