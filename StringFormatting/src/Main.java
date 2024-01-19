public class Main extends Object{
    public static void main(String[] args) {
        int day = 10;
        String age = String.format("you are %d", day);
        System.out.println(age);
//        age = "you are %d".formatted(day);
        System.out.println(age);

        String helloWorld = "Hello World";
        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
    }
}