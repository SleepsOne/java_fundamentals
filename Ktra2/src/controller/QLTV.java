/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import model.Bao;
import model.ChucNang;
import model.Sach;
import model.TaiLieu;

/**
 *
 * @author HP
 */
public class QLTV implements ChucNang {

    private List<TaiLieu> list;
    private Scanner sc = new Scanner(System.in);

    public QLTV() {
        list = new ArrayList<>();
    }

    //tim tai lieu theo ma- tra ve vi tri
    private int timViTri(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (ma.equalsIgnoreCase(list.get(i).getMa())) {
                return i;
            }
        }
        return -1;
    }

    // nhap cho Tai lieu
    private TaiLieu nhap() {
        String ma, tenNXB;
        int soBanPH;
        String re = "^[ABCD]\\d{3}";
        while (true) {
            try {
                System.out.println("ma: ");
                ma = sc.nextLine().toUpperCase();
                if (ma.matches(re) && timViTri(ma) == -1) {
                    break;
                } else {
                    throw new ValidException("Ma ton tai hoac ko dung dinh dang");
                }

            } catch (ValidException e) {
                System.err.println(e);
            }

        }
        System.out.println("Ten NXB: ");
        tenNXB = sc.nextLine();

        while (true) {
            try {
                System.out.println("So ban PH: ");
                soBanPH = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e);
            }

        }
        return new TaiLieu(ma, tenNXB, soBanPH);

    }

    @Override
    public void nhapSach() {
        TaiLieu t = nhap();
        String tenTG, tenSach;
        int soTrang;

        System.out.println("Ten TG: ");
        tenTG = sc.nextLine();
        System.out.println("Ten Sach: ");
        tenSach = sc.nextLine();

        while (true) {
            try {
                System.out.println("So Trang: ");
                soTrang = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e);
            }

        }
        list.add(new Sach(t.getMa(), t.getTenNXB(), t.getSoBanPH(), tenTG, tenSach, soTrang));

    }

    @Override
    public void nhapBao() {
        TaiLieu t = nhap();
        String ngay;
        String re = "\\d{1,2}/\\d{1,2}/\\d{4}";
        while (true) {
            try {
                System.out.println("ngay phat hanh: ");
                ngay = sc.nextLine();
                if (ngay.matches(re)) {
                    break;
                } else {
                    throw new ValidException("Ngay PH ko dung dinh dang");
                }

            } catch (ValidException e) {
                System.err.println(e);
            }

        }
        list.add(new Bao(t.getMa(), t.getTenNXB(), ngay, t.getSoBanPH()));
    }

    @Override
    public void hienThiDS() {
        for (TaiLieu t : list) {
            System.out.println(t);
        }
        System.out.println("---------------------");
        System.out.println("Tong " + list.size());

    }

    @Override
    public void luu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void docra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sua() {
        System.out.println("nhap vao ma can sua: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if (vt == -1) {
            System.out.println("khong tim thay ma can sua");

        } else {
            // SUA PHAN CHUNG
            TaiLieu t = list.get(vt);
            System.out.println("Ten NXB: ");
            String tenNXB = sc.nextLine();
            int soBanPH;

            while (true) {
                try {
                    System.out.println("So ban PH: ");
                    soBanPH = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println(e);
                }

            }
            t.setTenNXB(tenNXB);
            t.setSoBanPH(soBanPH);

            if (t instanceof Sach) {
                // sua sach
                String tenTG, tenSach;
                int soTrang;

                System.out.println("Ten TG: ");
                tenTG = sc.nextLine();
                System.out.println("Ten Sach: ");
                tenSach = sc.nextLine();

                while (true) {
                    try {
                        System.out.println("So Trang: ");
                        soTrang = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println(e);
                    }

                }

                ((Sach) t).setTenTG(tenTG);
                ((Sach) t).setTenSach(tenSach);
                ((Sach) t).setSoTrang(soTrang);
            }

            if (t instanceof Bao) {
                String ngay;
                String re = "\\d{1,2}/\\d{1,2}/\\d{4}";
                while (true) {
                    try {
                        System.out.println("ngay phat hanh: ");
                        ngay = sc.nextLine();
                        if (ngay.matches(re)) {
                            break;
                        } else {
                            throw new ValidException("Ngay PH ko dung dinh dang");
                        }

                    } catch (ValidException e) {
                        System.err.println(e);
                    }

                }
                ((Bao) t).setNgayPH(ngay);

            }

        }
        System.out.println("sua thanh cong !!!");
    }

    @Override
    public void xoa() {
        System.out.println("nhap vao ma can xoa: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if (vt == -1) {
            System.out.println("khong tim thay ma can xoa");

        } else {
            System.out.println("Tai lieu xoa " + list.remove(vt));
            System.out.println("xoa thanh cong!!");
        }
    }

    @Override
    public void timTheoTenSach() {
        List<Sach> sach = new ArrayList<>();
        for (TaiLieu i : list) {
            if (i instanceof Sach) {
                sach.add((Sach) i);
            }

        }
        System.out.println("nhap ten can tim: ");
        String ten = sc.nextLine();
        int k = 0;
        for (Sach i : sach) {
            if (i.getTenSach().toLowerCase().indexOf(ten.toLowerCase()) >= 0) {
                System.out.println(i);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("khong tim thay");
        } else {
            System.out.println("Tong tim thay: " + k);
        }

    }

    @Override
    public void timBaoTuDenNam() {
        List<Bao> bao = new ArrayList<>();
        for (TaiLieu i : list) {
            if (i instanceof Bao) {
                bao.add((Bao) i);
            }
        }
        try {
            System.out.println("tim tu nam: ");
            int nam1 = Integer.parseInt(sc.nextLine());
            System.out.println("tim den nam: ");
            int nam2 = Integer.parseInt(sc.nextLine());
            int k = 0;
            for (Bao i : bao) {
                if (i.getNam() >= nam1 && i.getNam() <= nam2) {
                    System.out.println(i);
                    k++;
                }

            }
            if (k == 0) {
                System.out.println("ko tim thay");

            } else {
                System.out.println("Tong tim thay: " + k);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }

    @Override
    public void sapxepSOBanPH() {
        Collections.sort(list);
        hienThiDS();

    }

    @Override
    public void sapxepSachTheoTenTG() {
        //
        List<Sach> sach = new ArrayList<>();
        for (TaiLieu i : list) {
            if (i instanceof Sach) {
                sach.add((Sach) i);
            }

        }
        sach.sort(new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
                String ten1 = o1.getTenTG();
                String ten2 = o2.getTenTG();
                String t1 = ten1.substring(ten1.lastIndexOf(" ") + 1) + ten1;
                String t2 = ten1.substring(ten2.lastIndexOf(" ") + 1) + ten2;
                return t1.compareToIgnoreCase(t2);
            }
            
        });

    }

    @Override
    public void sapxepBao2TTinh() {
        List<Bao> bao = new ArrayList<>();
        for (TaiLieu i : list) {
            if (i instanceof Bao ) {
                bao.add((Bao) i);
            }
        }
        bao.sort(new Comparator<Bao>(){
//            String n1 = 

            @Override
            public int compare(Bao o1, Bao o2) {
                StringTokenizer n1 = new StringTokenizer(o1.getNgayPH());
                StringTokenizer n2 = new StringTokenizer(o2.getNgayPH());
                String ng1 = "";
                String ng2 = "";
                while (n1.hasMoreTokens()){
                    ng1 = n1.nextToken() + ng1;
                }
                while (n2.hasMoreTokens()){
                    ng2 = n2.nextToken() + ng2;
                }
                if (ng1.equalsIgnoreCase(ng2)){
                    return o1.getSoBanPH() - o2.getSoBanPH();
                }
                else{
                    return ng1.compareToIgnoreCase(ng2);
                }
                        
            }
        });
        
    }

    @Override
    public void thongke1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void thongke2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
