/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Calendar;

/**
 *
 * @author HP
 */
public class Bao extends TaiLieu implements ITaiLieu{
    private String ngayPH;

    public Bao() {
    }

    public Bao(String ma, String tenNXB,  String ngayPH, int soBanPH) {
        super(ma, tenNXB, soBanPH);
        this.ngayPH = ngayPH;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }
    
    
    
    

    @Override
    public String getCode() {
        String c = getMa().toUpperCase() + ngayPH.substring(ngayPH.lastIndexOf("/") + 1);
        return c;
    }     
    public int getNam(){
        try{
            return Integer.parseInt(ngayPH.substring(ngayPH.lastIndexOf("/") + 1)); 
        }catch(NumberFormatException e){
            Calendar c = Calendar.getInstance();
            return c.get(Calendar.YEAR);
        }
//        return 0;
    }

    @Override
    public String toString() {
        return getMa()+"\t"+getTenNXB()+"\t"+ngayPH+"\t"+getSoBanPH();
    }
    
    
    
}
