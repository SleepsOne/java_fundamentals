public class GiaoDichTT extends GiaoDich implements IGiaoDich{
    private double tigia;
    private String loaiTien;

    public GiaoDichTT() {

    }



    public GiaoDichTT(String ma, String ngay, double gia, int soluong, double tigia, String loaiTien) {
        super(ma, ngay, gia, soluong);
        this.tigia = tigia;
        this.loaiTien = loaiTien;
    }

    public double getTigia() {
        return tigia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setTigia(double tigia) {
        this.tigia = tigia;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    @Override
    public double getThanhTien(){
        if (getLoaiTien().equalsIgnoreCase("VN")){
            return (super.getSoluong()*super.getGia());
        }
        else {
            return (super.getSoluong()*super.getGia()* getTigia());
        }
    }

    @Override
    public String toString() {
        return getMa() + "\t" + getNgay() + "\t" +
                getGia() + "\t"+ getSoluong()+ "\t" +  getThanhTien()+ "\t" + getLoaiTien();
    }
}
