package ThiGiuaKy;

import java.util.ArrayList;
import java.util.List;

public class HoaDonTheoNgay extends HoaDon {
    private int soNgayThue;

    private static List<HoaDonTheoNgay> list = new ArrayList<HoaDonTheoNgay>();

    protected int thanhTien(int soNgayThue, int donGia) {
        if (soNgayThue > 7)
            donGia = donGia * 20/100;

        return soNgayThue * donGia;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay() {
        list.add(this);
    }

    public static List<HoaDonTheoNgay> getListHoaDonTheoNgay() {
        return list;
    }

    public int tongSoLuong() {
        return list.size();
    }

    @Override
    public void nhapHoaDon() throws Exception {
        super.nhapHoaDon();
        System.out.print("Hay nhap so ngay thue: ");
        setSoNgayThue(input.nextInt());

        
    }
}
