import java.util.*;
import java.util.function.*;

public class Main {
    enum WeekDay{
        Monday (2),Tuesday(3), Wednesday(4), Thursday(5), Friday(6), Saturday(7), Sunday(1);
        private int day;
        WeekDay(int d) {
            this.day = d;
        }


        public static WeekDay getDay(int val){
            for (WeekDay d : WeekDay.values()){
                if (d.day == val){
                    return d;
                }


            }
            return null;
        }

        @Override
        public String toString() {
            return "WeekDay{" +
                    "day=" + day +
                    '}';
        }
    }

    public static void main(String[] args) {
//        System.out.println(WeekDay.valueOf("Monday").name());
//
//        System.out.println(WeekDay.getDay(2).name());
        var list = new ArrayList<String>(List.of("a","b", "c"));
        list.addAll()
        list.forEach(s -> System.out.println(s));
        list.removeIf(s -> s.equalsIgnoreCase("a"));
        System.out.println("after removed:");
        list.forEach(s -> System.out.println(s));


        System.out.println(calculator((var a, var b) -> a + b, 1, 2));
        var records = Arrays.asList(
                new double[]{1.2, 1.3},
                new double[]{1.4, 1.5},
                new double[]{1.6, 1.7}
        );
        records.forEach(s -> processPoint(s[0], s[1], (a, b)
                -> System.out.println(a +" va " + b)));


        String[] values = {"Lai", "Hop", "Duc"};
        String[] randomlyNewValues = randomlySelectedValues(7, values,
                () -> new Random().nextInt(0, values.length));
        System.out.println(Arrays.toString(randomlyNewValues));

        Consumer<String> x = (String t) -> {
//            String[] tmp = t.split(" ");
//            Arrays.asList(tmp).forEach(s -> System.out.println(s));
            Arrays.asList(t.split(" ")).forEach(s -> System.out.println(s));
        };
        x.accept("Lai Hop Duc");
        Supplier<String> iLoveJava = () -> "i love java";
        System.out.println(iLoveJava.get());
        UnaryOperator<String> lbda1 = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i< source.length(); i++){
                if (i % 2 == 1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondCharacter(lbda1, "1234567890"));

//        PlainOld


    }
    public static <T> T calculator(Operation<T> function, T val1, T val2){
        T res = function.operate(val1, val2);
        System.out.println("Result of the operation = " + res);
        return res;
    }
    public static <T> void processPoint(T t1, T t2, BiConsumer <T, T> consumer){
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s){
        String[] selectedValues = new String[count];
        for (int i = 0; i< count; i++){
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;

    }
    public static String everySecondCharacter(UnaryOperator<String> uoIn, String source){
        return uoIn.apply(source);

    }
}
