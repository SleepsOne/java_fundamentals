package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        LinkedList <Place> placeToVisits = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addElements(placeToVisits, adelaide);
        addElements(placeToVisits, new Place("adelaide", 1374));
        addElements(placeToVisits, new Place("Brisbane", 917));
        addElements(placeToVisits, new Place("Perth", 3293));
        addElements(placeToVisits, new Place("Alice Springs", 2711));
        addElements(placeToVisits, new Place("Darwin", 3972));
        addElements(placeToVisits, new Place("Melbourne", 877));

        placeToVisits.addFirst(new Place("Sydney", 0));

        System.out.println(placeToVisits);
        boolean quitLoop = false;
        boolean  forward = false;
        var it = placeToVisits.listIterator();

        printMenu();

        while (!quitLoop) {
            if (!it.hasPrevious()){
                System.out.println("Originating : " + it.next());
                forward = true;
            }
            if (!it.hasNext()){
                System.out.println("Final : " + it.previous());
                forward = false;
            }
            System.out.println("Enter value: ");
            String menuItem = sc.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F"-> {
                    if (!forward){
                        forward = true;
                        if (it.hasNext()){
                            it.next();
                        }
                    }
                    System.out.println("User wants to forward");
                    if (it.hasNext()){
                        System.out.println(it.next());
                    }
                }
                case "B"-> {
                    if (forward){
                        forward = false;
                        if (it.hasPrevious()){
                            it.previous();
                        }
                    }
                    System.out.println("User wants to backward");
                    if (it.hasPrevious()) {
                        System.out.println(it.previous());
                    }
                }
                case "L"-> {
                    System.out.println(placeToVisits);
                }
                case "M"-> {
                    printMenu();
                }
                case "Q"-> {
                    quitLoop = false;
                }

            }



        }

        /*String choice;


        do {
            System.out.println("""
                    Available actions (select word or letter):
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit
                    """);
            System.out.println("Choose your choice: ");
            choice = sc.nextLine();
            switch (choice){
                case "Forward", "F" -> {forwardPlace();}
                case "Backward", "B"-> {}
                case "List Places", "L"-> {}
                case "Menu", "M"-> {}
                default ->  {}

            }
        }while (!choice.equals("Q") && !choice.equals("Quit"));
        */
    }

    private static void addElements(LinkedList<Place> list, Place place) {
        if (list.contains(place)){
            System.out.println("Found duplicated: " + place);
            return;
        }

        for (var placeList : list){
            if (placeList.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicated: " + place);
                return;
            }
        }
        int index = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()){
                list.add(index, place);
                return;
            }
            index++;
        }
        list.add(place);
    }


    private static void printMenu(){
        System.out.println("""
                    Available actions (select word or letter):
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit
                    """);
    }

    public static void forwardPlace(){

    }
    public static void backwardPlace(){

    }
    public static void listPlaces(){

    }
    public static void menu(){

    }
}
