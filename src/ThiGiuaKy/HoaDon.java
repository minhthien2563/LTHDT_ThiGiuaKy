package ThiGiuaKy;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public abstract class HoaDon {
    private String maHoadon;
    private Date ngayHoaDon;
    private String tenKhachHang;
    private String maPhong;
    private int donGia;
    SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
    Scanner input = new Scanner(System.in);
    private static List<HoaDon> list = new ArrayList<HoaDon>();

    public abstract int tongSoLuong();

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
    public int getDonGia() {
        return donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void nhapHoaDon() throws Exception {
        System.out.print("Hay nhap ma hoa don: ");
        setMaHoadon(input.nextLine());
        System.out.println("Ban muon tu nhap ngay hay tu dong nhan ngay? 1. Tu nhap - 2. Tu dong nhap");
        switch (input.nextInt()) {
            case 1: {
                input.nextLine();
                System.out.print("Hay nhap ngay theo dinh dang dd/mm/yyyy: ");
                setNgayHoaDon(ngayVietNam.parse(input.nextLine()));
                break;
            }
            case 2: {
                Date ngayHienTai = new Date();
                System.out.println("Ngay tu dong nhan la " + ngayHienTai);
                setNgayHoaDon(ngayHienTai);
                input.nextLine();
                break;
            }
        }
        System.out.print("Hay nhap ten khach hang: ");
        setTenKhachHang(input.nextLine());
        System.out.print("Hay nhap ma phong: ");
        setMaPhong(input.nextLine());
        System.out.print("Hay nhap don gia: ");
        setDonGia(input.nextInt());
        list.add(this);
    }

    public static List <HoaDon> getList() {
        return list;
    }

}
