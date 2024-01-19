package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>(); // phai cho ro kieu type ra
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);


//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);



//        gettingElements(placesToVisit);
//        printItinerary(placesToVisit);

//        testIterator(placesToVisit);

        testListIterator(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack methods
        list.push("Alice Springs"); // first
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");
        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");
        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");
        // Queue/ Dequeue methods
        String p1 = list.poll(); //first
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst(); //first
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast(); //last
        System.out.println(p3 + " was removed");

        System.out.println(list);

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);
        String p4 = list.pop();
        System.out.println(p4 + " was removed");


    }
    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieve Element = " + list.get(4));
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        // Queue retrieval methods
        System.out.println("Element from element() = " + list.element()); //first
        // Stack methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast()  );
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previous_town = list.getFirst();
        ListIterator<String> it = list.listIterator(1);
        while (it.hasNext()){
            var town = it.next();
            System.out.println("--> From: " + previous_town + " to " + town);
            previous_town = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
//        Iterators allow the caller to remove elements from the underlying collection during the iteration with well-defined semantics.
        var it = list.iterator();
        while (it.hasNext()){
//            System.out.println(it.next());
            if (it.next().equals("Brisbane")) it.remove();
        }
        System.out.println(list);
    }
    private static void testListIterator(LinkedList<String> list){
//        Iterators allow the caller to remove elements from the underlying collection during the iteration with well-defined semantics.
        var it = list.listIterator();
        while (it.hasNext()){
//            System.out.println(it.next());
            if (it.next().equals("Brisbane")) it.add("Lake");
        }

        // backwards methods
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println(list);

        var it2 = list.listIterator(3);
        System.out.println(it2.next());
    }

}
