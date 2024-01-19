import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Stuff{
    private String ma, ten, theloai;
    private int giaNhap, giaXuat, slg;
    private int tygia;

    public Stuff(String ma, String ten, String theloai) {
        this.ma = ma;
        this.ten = ten;
        this.theloai = theloai;
    }

    public int getTygia() {
        if (theloai.equals("A")){
            return 8;
        }
        else if (theloai.equals("B")){
            return 5;
        }
        return 2;

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

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaXuat() {
        return giaXuat;
    }

    public void setGiaXuat(int giaXuat) {
        this.giaXuat = giaXuat;
    }

    public int getSlg() {
        return slg;
    }

    public void setSlg(int slg) {
        this.slg = slg;
    }


    @Override
    public String toString() {
        return ma + " " + ten + " " + giaNhap + " " + giaXuat;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Stuff> list = new ArrayList<>();
        while (n --> 0){
            list.add(new Stuff(sc.nextLine(), sc.nextLine(), sc.nextLine()));

        }
        int m = Integer.parseInt(sc.nextLine());
        while (m --> 0){
            String ma = sc.next();
            int nhap = Integer.parseInt(sc.next());
            int gia = Integer.parseInt(sc.next());
            int xuat = Integer.parseInt(sc.next());
            for (Stuff x : list){
                if (x.getMa().equals(ma)){
                    x.setGiaNhap(nhap * gia);
                    x.setGiaXuat(xuat * gia * (100 + x.getTygia()) / 100);
                    System.out.println(x);
                }

            }
        }

    }
}
