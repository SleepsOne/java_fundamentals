import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaThuc p = new DaThuc(sc.nextLine());
        DaThuc q = new DaThuc(sc.nextLine());
        DaThuc r = p.cong(q);
        r.out();
    }
}