import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class SinhVien{
    private String ma, ten, lop ,email, doanhNghiep;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        chuanHoa();

    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void chuanHoa(){
        String[] tmp = ten.split("\\s+");
        String ans = "";
        for (String x : tmp){
            ans += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        ans = ans.substring(0, ans.length()-1);
        ten = ans;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }

    public void setDoanhNghiep(String doanhNghiep) {
        this.doanhNghiep = doanhNghiep;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop;
    }
}

class DoanhNghiep{
    private String ma, ten;
    private int soLuong;
    private List<SinhVien> list;

    public DoanhNghiep(String ma, String ten, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        list = new ArrayList<>();
    }
    public void themSinhVien(SinhVien p){
            list.add(p);




    }

    public List<SinhVien> getList() {
        return list;
    }

    public void setList(List<SinhVien> list) {
        this.list = list;
    }

    public DoanhNghiep(){


    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        List<SinhVien> list = new ArrayList<>();
        int n1 = Integer.parseInt(sc1.nextLine());
        while (n1 --> 0){
            list.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }


        Scanner sc2 = new Scanner(new File("DN.in"));
        List<DoanhNghiep> listDN = new ArrayList<>();

        int n2 = Integer.parseInt(sc2.nextLine());
        while (n2 --> 0){
            listDN.add(new DoanhNghiep(sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine())));
        }


        Scanner sc3 = new Scanner(new File("THUCTAP.in"));
        int n3 = Integer.parseInt(sc3.nextLine());
        Map <String, String> mp = new TreeMap<>();
        while (n3 --> 0 ){
            String[] tmp = sc3.nextLine().trim().split("\\s+");
            for (DoanhNghiep x : listDN){
                if (x.getMa().equals(tmp[1])){
                    for (SinhVien i : list){
                        if (i.getMa().equals(tmp[0])){
                            x.themSinhVien(i);
                        }
                    }
                }
            }
            mp.put(tmp[0], tmp[1]);
        }
        int m3 = Integer.parseInt(sc3.nextLine());
        while (m3 --> 0){
            String ma = sc3.nextLine();
            for (DoanhNghiep x : listDN){
                if (x.getMa().equals(ma)){
                    System.out.print(String.format("DANH SACH THUC TAP TAI %s:\n", x.getTen()));
                    x.getList().sort((o1, o2)-> o1.getMa().compareTo(o2.getMa()));
                    for (int i = 0; i < Math.min(x.getList().size(), x.getSoLuong()); i++){
                        System.out.println(x.getList().get(i));
                    }
                }

            }

        }

    }
}
