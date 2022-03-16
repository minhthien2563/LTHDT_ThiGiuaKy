package ThiGiuaKy;

import java.util.Date;

public abstract class HoaDon {
    private String maHoadon;
    private Date ngayHoaDon;
    private String tenKhachHang;
    private String maPhong;
    private double donGia;

    public String getMaHoadon() {
        return maHoadon;
    }
    public void setMaHoadon(String maHoadon) {
        this.maHoadon = maHoadon;
    }
    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }
    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }
    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public abstract int tongSoLuong();

    
}
