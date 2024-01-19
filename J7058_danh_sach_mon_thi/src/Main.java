import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Subject {
    private String id, name, hinhThucThi;

    public Subject(String id, String name, String hinhThucThi) {
        this.id = id;
        this.name = name;
        this.hinhThucThi = hinhThucThi;
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + hinhThucThi;
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> list = new ArrayList<>();

        for (int i= 0; i< n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String hinhthucThi = sc.nextLine();
            list.add(new Subject(id, name, hinhthucThi));
        }

        Collections.sort(list, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        for (Subject x : list){
            System.out.println(x);
        }

    }
}



