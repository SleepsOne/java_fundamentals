package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> grocries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(sc.nextLine())){
                case 1 -> {addItems(grocries);}
                case 2 -> {removeItems(grocries);}
                default -> {
                    printItems(grocries);
                    flag = false;
                }
            }
        }

    }

    public static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = sc.nextLine().split(",");

        for (String x : items){
            String trimmed = x.trim();
            if (groceries.indexOf(trimmed) < 0) { // not in there
                groceries.add(trimmed);
            }
        }


    }
    public static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = sc.nextLine().split(",");

        for (String x : items){
            String trimmed = x.trim();
            groceries.remove(trimmed);
        }
    }


    public static void printItems(ArrayList<String> groceries) {
        groceries.sort(Comparator.naturalOrder());
        System.out.println("Items's List: ");
        for (int i = 0; i < groceries.size(); i++){
            System.out.printf("%d. %s%n", i + 1, groceries.get(i));
        }
    }


    public static void printActions(){
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");
    }
}
