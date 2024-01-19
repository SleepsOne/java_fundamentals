/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

/**
 *
 * @author HP
 */
public class TaiLieu {
    public String ma;
    public String tenNhaXB;
    public int SoBanPH;
    protected int soAnPham;
    public static int cnt = 0;

    public TaiLieu() {
    }

    public TaiLieu(String tenNhaXB, int SoBanPH) {
       
        this.tenNhaXB = tenNhaXB;
        this.SoBanPH = SoBanPH;
        
    }
    
    

    public String getMa() {
        return ma;
    }
    public void setMa(String ma){
        this.ma = ma;
    }
    public void setMa() {
         
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public int getSoBanPH() {
        return SoBanPH;
    }

    public void setSoBanPH(int SoBanPH) {
        this.SoBanPH = SoBanPH;
    }
    
    
    
    
    
    
    
    
    
    
}
