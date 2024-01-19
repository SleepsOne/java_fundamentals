public class Main {
    public static void main(String[] args) {
        int day = 7;
        String age = String.format("%d ", day);
       String formattedString = "you are is %d".formatted(day);
        System.out.println(formattedString);
    }
}