/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author HP
 */
class NhanVien {

    private String ma, ten, pban;
    private int ngaycong, luongcb, heso;

    public NhanVien(String ma, String ten, int luongcb, int ngaycong) {
        this.ma = ma;
        this.ten = ten;
        this.ngaycong = ngaycong;
        this.luongcb = luongcb;
    }

    public String getPban() {
        return pban;
    }

    public void setPban(String pban) {
        this.pban = pban;
    }

    public int getNgaycong() {
        return ngaycong;
    }

    public void setNgaycong(int ngaycong) {
        this.ngaycong = ngaycong;
    }

    public int getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(int luongcb) {
        this.luongcb = luongcb;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    public int getTotal() {
        return luongcb * heso * ngaycong * 1000;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + getTotal();
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

}

public class TinhLuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
//        int n = Integer.parseInt(sc.nextLine())
        Map<String, String> mp = new HashMap();
        while (n-- > 0) {
            String s1 = sc.nextLine();
            mp.put(s1.substring(0, s1.indexOf(" ")), s1.substring(s1.indexOf(" ") + 1));
        }
        int m = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();

        while (m-- > 0) {
            list.add(new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for (NhanVien x : list){
            String ma = x.getMa();
            x.setHeso(convertHeso(ma.charAt(0), Integer.parseInt(ma.substring(1, 3))));
            for (Map.Entry<String, String> it : mp.entrySet()){
                if(ma.substring(3).equals(it.getKey())){
                    x.setPban(it.getValue());
                }
            }
        }
        String se = sc.nextLine();
        System.out.println("Bang luong phong " + mp.get(se) + ":");
        for (NhanVien x  : list){
            if (x.getMa().substring(3).equals(se))
                System.out.println(x);
        }

    }
    public static int convertHeso(char nhom, int nam){
        Map <Character, List<Integer>> mp = new TreeMap();
        int[] a = new int[]{10, 12, 14, 20};
        int[] b = new int[]{10, 11, 13, 16};
        int[] c = new int[]{9, 10, 12, 14};
        int[] d = new int[]{8, 9, 11, 13};
//        mp.put('A',List.of(10, 12, 14, 20));
        mp.put('A',Arrays.stream(a).boxed().collect(Collectors.toList()));
        mp.put('B',Arrays.stream(b).boxed().collect(Collectors.toList()));
        mp.put('C',Arrays.stream(c).boxed().collect(Collectors.toList()));
        mp.put('D',Arrays.stream(d).boxed().collect(Collectors.toList()));
//        mp.put('B',List.of(10, 11, 13, 16));
//        mp.put('C',List.of(9, 10, 12, 14));
//        mp.put('D',List.of(8, 9, 11, 13));
        // handling
        for (Map.Entry<Character, List<Integer>> it : mp.entrySet()) {
            Character key = it.getKey();
            if (key == nhom) {
                if (nam >= 16) {
                    return it.getValue().get(3);
                } else if (nam >= 9) {
                    return it.getValue().get(2);

                } else if (nam >= 4) {
                    return it.getValue().get(1);
                } else {
                    return it.getValue().get(0);
                }

            }
        }
        return -1;

//        int[] b = new int[]{10, 11, 13, 16};
//        int[] c = new int[]{9, 10, 12, 14};
//        int[] d = new int[]{8, 9, 11, 13};
//        mp.put('A', Arrays.asList(a));
    }

}
