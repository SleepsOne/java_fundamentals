public class GiaoDich {
    // ma giao dich, ngay giao dich
    // ngay thang nam don gia, so luong
    private String ma, ngay;
    private double gia;
    private int soluong;

    public GiaoDich(){

    }

    public GiaoDich(String ma, String ngay, double gia, int soluong) {
        this.ma = ma;
        this.ngay = ngay;
        this.gia = gia;
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }


}
