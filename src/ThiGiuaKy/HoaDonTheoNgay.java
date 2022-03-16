package ThiGiuaKy;

import java.util.ArrayList;

public class HoaDonTheoNgay extends HoaDon {
    private int soNgayThue;

    private static ArrayList<HoaDonTheoNgay> list = new ArrayList<HoaDonTheoNgay>();

    protected int thanhTien(int soNgayThue, int donGia) {
        if (soNgayThue > 7)
            donGia = donGia * 20/100;

        return soNgayThue * donGia;
    }

    public HoaDonTheoNgay(int soNgayThue) {
        this.soNgayThue = soNgayThue;
        list.add(this);
    }

    public int tongSoLuong() {
        return list.size();
    }
}
