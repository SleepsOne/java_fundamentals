public class Main {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756));
    }


    public static boolean areEqualByThreeDecimalPlaces (double a, double b){
        a = (long)(a * 1000);
//        System.out.println(a);
        b = (long)(b * 1000);
//        System.out.println(b);
        return a == b;
    }
}