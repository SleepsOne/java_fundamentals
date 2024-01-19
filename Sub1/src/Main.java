import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
//        Date d = df.parse(sc.nextLine());
//        Date d2 = df.parse(sc.nextLine());
//        long x = d2.getTime() - d.getTime();
//        System.out.println(x/(3600*24*1000));
        //
        SimpleDateFormat df1 = new SimpleDateFormat("HH:mm");
        Date time1 = df1.parse(sc.nextLine());
        Date time2 = df1.parse(sc.nextLine());
        int n = 3;
        while (n --> 0){
            long dffmili = time2.getTime() - time1.getTime();
            long gio = (dffmili / (3600 * 1000)) % 24;
            long phut = (dffmili / (60 * 1000)) % 60;
            System.out.println(gio);
            System.out.println(phut);
            System.out.println((int)Math.round(phut / 3.0) * 800);
        }

        System.out.println(Math.round(7 / 3.0));


    }

}