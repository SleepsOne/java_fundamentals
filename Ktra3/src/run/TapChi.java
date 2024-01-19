/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class TapChi extends TaiLieu implements ITaiLieu {

    private String thang;
    public static int No1;

    public TapChi() {
    }

    public TapChi(String tenNhaXB, int SoBanPH, String thang) {
        super(tenNhaXB, SoBanPH);
        this.thang = thang;
        cnt++;
        No1 = cnt;
        
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    @Override
    public void setMa() {
        String[] s = getTenNhaXB().split("\\s+");
//        System.out.println(s);
        String tmp = "";
        for (String x : s) {
            tmp += x.charAt(0);

        }
//        cnt++;
        String fm = String.format("%03d", No1);
//        System.out.println(tmp + fm);

        setMa(tmp + fm);

    }

    @Override
    public String toString() {
//        setMa();
//        System.out.println(getMa());
//        System.out.println(getTenNhaXB());
        this.setMa();

        return getMa() + " " + getTenNhaXB() + " " + getSoBanPH() + " " + getThang() + " " + getSoAnPham();
    }

    @Override
    public int getSoAnPham() {
        int cnt = 0;
        int k = getSoBanPH();
        if (k >= 0 && k <= 100) {
            cnt = (int) k * 2 / 100;
//            return cnt;
        } else if (k >= 101 && k <= 200) {
            cnt = (int) k * 5 / 100;
//            return cnt;
        } else if (k >= 201) {
            cnt = (int) k * 8 / 100;
//            return cnt;
        }
        if (getTenNhaXB().equalsIgnoreCase("giao duc")) {
            cnt = cnt * 102 / 100;
        }
        return cnt;

    }

}
