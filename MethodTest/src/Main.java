

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {

    private static Random random = new Random();

    private static class Person {
        private String first;

        public Person(String first) {
            this.first = first;
        }

        public String last(String s) {
            return first + " " + s.substring(0, s.indexOf(" "));
        }
    }

    public static void main(String[] args) {
        String[] xa = {"!", "?", "@"};
        String tmp = "";
        for (int i = 0; i<9; i++){
            tmp += random.nextInt(9) + "";
            tmp += (char)(random.nextInt(122-97+1) + 97)  + "";
            tmp += xa[random.nextInt(2)];
        }
        System.out.println(tmp);

        String[] names = {"Anna", "Bob", "Cameron", "Donald", "Eva", "Francis"};

        Person tim = new Person("Tim");

        List<UnaryOperator<String>> list = new ArrayList<>(Arrays.asList(
                String::toUpperCase,
                s -> s += " " + getRandomChar('D', 'M') + ".",
                s -> s += " " + reverse(s, 0, s.indexOf(" ")),
                Main::reverse,
                String::new,
                s -> new String("Howdy " + s),
                String::valueOf,
                tim::last,
                new Person("MARY")::last
        ));

        applyChanges(names, list);
//        Collections.addAll(list, names)
//        Collections.binarySearch(list, tim, null)
        Collections.replaceAll(list, list, names)
        
    }

    private static void applyChanges(String[] names,
                                     List<UnaryOperator<String>> stringFunctions) {

        List<String> backedByArray = Arrays.asList(names);
        for (UnaryOperator<String> function : stringFunctions) {
            backedByArray.replaceAll(s -> function.apply(s));
            System.out.println(Arrays.toString(names));
        }
//        backedByArray.containsAll(backedByArray)
        
    }

    private static char getRandomChar(char startChar, char endChar) {
        return (char) (startChar + random.nextInt(endChar - startChar + 1));
    }

    private static String reverse(String s) {
        return reverse(s, 0, s.length());
    }

    private static String reverse(String s, int start, int end) {
        return new StringBuilder(s.substring(start, end)).reverse().toString();
    }
}