import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NganHang implements ChucNang{
    List<GiaoDich> list;

    public NganHang(){
        list = new ArrayList<>();
        list.add(new GiaoDichVang("V654", "09/12/2022", 65000,12, "9999" ));
        list.add(new GiaoDichVang("V765", "09/20/2022", 34000,22, "k24" ));
        list.add(new GiaoDichVang("V999", "12/10/2023", 23000,12, "k12" ));
        list.add(new GiaoDichTT("TT769", "1/5/2022", 23000,20, 0, "USD");
        list.add(new GiaoDichTT("TT00", "20/9/2022", 2000,100, 0, "VN");






    }



    @Override
    public void nhapGiaoDichVang() {

    }

    @Override
    public void nhapGiaoDichTT() {

    }

    @Override
    public void out() {
        for (GiaoDich i : list) {
            System.out.println(i);
        }
        System.out.println("------------------");
        System.out.println("tong : = " + list.size());


    }
    private int getGDbyMa(String ma){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)){
                return i;
            }

        }
        return -1;
    }
    @Override
    public void xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma can xoa:");
        String ma = sc.nextLine();
        int pos = getGDbyMa(ma);
        if (pos == -1){
            System.out.println("thay dau ma xoa");
        }
        else {
            list.remove(pos);
            System.out.println("xoa thanh cong");

        }



    }
}
