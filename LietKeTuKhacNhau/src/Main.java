import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class WordSet{
    String fileName;
    Set <String> set;

    public WordSet(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        set = new TreeSet<>();
        Scanner sc1 = new Scanner(new File(fileName));
//        Set <String> set = new TreeSet<>();
        while (sc1.hasNextLine()) {
            String[] tmp = sc1.nextLine().split("\\s+");
            for (String x : tmp) {
                set.add(x.toLowerCase());
            }
        }
    }
    @Override
    public String toString() {
        String ans = "";
        for (String x : set){
            ans += x + "\n";
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
       Scanner sc = new Scanner("Hello.txt");
       while (sc.hasNextLine()){
           System.out.println(sc.nextLine());
       }
    }
}
