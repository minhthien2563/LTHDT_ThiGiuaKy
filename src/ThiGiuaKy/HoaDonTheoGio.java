package ThiGiuaKy;

import java.util.List;
import java.util.ArrayList;

public class HoaDonTheoGio extends HoaDon {
    private int soGioThue;

    private static List<HoaDonTheoGio> list = new ArrayList<HoaDonTheoGio>();

    protected int thanhTien(int soGioThue, int donGia) {
        if (soGioThue > 24 || soGioThue < 30)
            soGioThue = 24;

        return soGioThue * donGia;
    }

    public HoaDonTheoGio(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    HoaDonTheoGio() {
        list.add(this);
    }

    protected int getSoGioThue() {
        return soGioThue;
    }

    protected void setSoGioThue(int soGioThue) {
        if (soGioThue > 30)
            System.out.println("So gio thue da vuot 30 tieng, khong the su dung loai hoa don nay.");
        else
            this.soGioThue = soGioThue;
    }

    public static List<HoaDonTheoGio> getList() {
        return list;
    }

    public int tongSoLuong() {
        return list.size();
    }

    
}
