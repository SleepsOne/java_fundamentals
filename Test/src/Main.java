
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */

interface StringExtensions {
    static <R> R transform(Function<? super String, ? extends R> f, String s) {
        return f.apply(s);
    }
}
public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
//        String[] names = {"Anna", "Bob", "Carole", "David", "Ed", "Fred", "Gary"};
//        Arrays.setAll(names, (i) -> names[i].toUpperCase());
//        System.out.println("--> Transform to Uppercase");
//        System.out.println(Arrays.toString(names));
//        List <String> backedByArray = Arrays.asList(names);
//        backedByArray.replaceAll(s -> s + " " + getRandomChar('A', 'D') + ".");
//        System.out.println("--> Add random middle initial");
//        System.out.println(Arrays.toString(names));
//        backedByArray.replaceAll(s -> s + " " + getReversedString(s.split(" ")[0]));
//        System.out.println("--> Add reversed name as last name");
//        Arrays.asList(names).forEach(s -> System.out.println(s));
////        backedByArray.forEach(s -> System.out.println(s)); 
//        System.out.println("-----------------");
//        List <String> nlist = new ArrayList<>(backedByArray);
//        nlist.removeIf((String s) ->{
//            String tmp1 = s.substring(0, s.indexOf(" "));
//            String tmp2 = s.substring(s.lastIndexOf(" ") + 1);
//            return tmp1.equals(tmp2);
//        });
//        nlist.forEach(s -> System.out.println(s));
//        ANNA D. ANNA
        

    }
    
    public static char getRandomChar(char start, char end){
        return (char) (random.nextInt(end + 1 - start + 1) + start);
    }
    public static String getReversedString(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s) {
        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;

    }
    public static void applyChanges(String[] names, List <UnaryOperator<String>> stringFunctions){
        List <String> backedByArray = Arrays.asList(names);
        for (UnaryOperator<String> funtion : stringFunctions){
            backedByArray.replaceAll(s -> StringExtensions.transform(funtion, s));
            System.out.println();
        }
    }
    

}
