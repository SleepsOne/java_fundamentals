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
public class Sach extends TaiLieu implements ITaiLieu{
    private String tenSach;
    private String tenTG;
    private int soTrang;
    public static int No2;

    public Sach() {
    }

    public Sach(String tenSach, String tenTG,  String tenNhaXB,int soTrang, int SoBanPH) {
        
        super(tenNhaXB, SoBanPH);
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
        cnt++;
        No2 = cnt;
               
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void setMa() {
        String st[] = getTenTG().split(" ");
        String tmp = st[st.length - 1].toUpperCase();
        
        String fm = String.format("%03d", No2);
//        super.cnt++;
        
//        setCnt();
        setMa(tmp + fm);
    }

    @Override
    public String toString() {
        this.setMa();
        return getMa() + " " + getTenSach() + " " + getTenTG() + " " + getTenNhaXB() + " "+ getSoBanPH() + " " +getSoAnPham();
                
    }
    
    
    @Override
    public int getSoAnPham() {
        int cnt = 0;
        int k = getSoBanPH();
        if (k >= 0 && k <= 200){
            cnt = (int)k * 5 / 100;
//            return cnt;
        }
        else if(k >= 201 && k <= 500){
            cnt = (int)k * 8 / 100;
//            return cnt;
        }
        else if(k >= 501){
            cnt = (int)k * 10 / 100;
//            return cnt;
        }
        if (getTenNhaXB().equalsIgnoreCase("giao duc")){
            cnt = cnt * 98 / 100;
        }
        return cnt;
    }
    
    
}
