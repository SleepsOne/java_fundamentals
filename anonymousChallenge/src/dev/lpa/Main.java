package dev.lpa;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Employee(String first, String last, String hireDate){

};

public class Main {
    public static void main(String[] args) {
        List <Employee> list = new ArrayList<>(List.of(
                new Employee("Minnie" , "Mouse", "01/02/2015"),
        new Employee("Mickie" , "Mouse", "05/08/2000"),
        new Employee("Daffy" , "Duck", "11/02/2011"),
        new Employee("Daisy" , "Duck", "05/03/2013"),
        new Employee("Goofy" , "Dog", "23/07/2020")));
        printOrderedList(list, "name");
        System.out.println();
        printOrderedList(list, "year");


    }
    public static void printOrderedList (List <Employee> list, String sortField){
        int currentYear = LocalDate.now().getYear();

        class MyEmployee{
            Employee containedEm;
            int yearWorked;
            String fullname;

            MyEmployee(Employee containEm){
                this.containedEm = containEm;
                yearWorked = currentYear - Integer.parseInt(containEm.hireDate().split("/")[2]);
                fullname = containEm.first() + " " + containEm.last();
            }

            @Override
            public String toString() {
                return fullname + " " + yearWorked;
            }
        }
        List <MyEmployee> nlist = new ArrayList<>();

        for (Employee x : list){
            nlist.add(new MyEmployee(x));
        }
        
        nlist.sort((o1, o2) -> {
            if (sortField.equals("name")) {
                return o1.fullname.compareTo(o2.fullname);

            }
            return Integer.compare(o1.yearWorked, o2.yearWorked);
        });
        for (MyEmployee x : nlist){
            System.out.println(x);
        }

    }
}

