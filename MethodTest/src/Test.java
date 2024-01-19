
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Test {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 3, 2, 6, 4};
        List <Integer> list1 = new ArrayList(Arrays.asList(a));
        List <Integer> list = new ArrayList(list1);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Collections.binarySearch(list, Integer.valueOf(3), Comparator.naturalOrder()));
        Collections.rotate(list, 2);
        System.out.println(list);
    }
    
}
