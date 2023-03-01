package bai2;

public class KyThuat extends NhanVien{
    public String chuyenNganh;

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public KyThuat(String maNhanVien) {
        super(maNhanVien);
    }

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "KyThuat{" +
                "chuyenNganh='" + chuyenNganh + '\'' +
                ", maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    @Override
    public String moTaCongViec() {
        return String.format("Cong viec cua nhan vien là: %s", chuyenNganh);
    }
}
