public class GiaoDichVang extends GiaoDich implements IGiaoDich{
    private String loaiVang;
    public GiaoDichVang(String s, int i, int i1, String number){

    }



    public GiaoDichVang(String ma, String ngay, double gia, int soluong, String loaiVang) {
        super(ma, ngay, gia, soluong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public double getThanhTien(){
        return (super.getSoluong()*super.getGia());
    }


    public String toString() {
        return getMa() + "\t" + getNgay() + "\t" +
                getGia() + "\t"+ getSoluong()+ "\t" +  getThanhTien()+ "\t" + getLoaiVang();
    }
}
