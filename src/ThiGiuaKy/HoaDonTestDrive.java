package ThiGiuaKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HoaDonTestDrive {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");

        HoaDon hoaDonTheoNgay = new HoaDonTheoNgay();

        hoaDonTheoNgay.setNgayHoaDon(ngayVietNam.parse("1/1/2001"));
        System.out.println(hoaDonTheoNgay.tongSoLuong());

        HoaDon hoaDonTheoGio = new HoaDonTheoGio();

        hoaDonTheoGio.setNgayHoaDon(ngayVietNam.parse("02/09/2013"));
        hoaDonTheoGio.setDonGia(1000);
        
        SimpleDateFormat ngaySoSanh = new SimpleDateFormat("MM/yyyy");
        int tongSoTien = 0;
        ((HoaDonTheoGio) hoaDonTheoGio).setSoGioThue(5);

        for (HoaDonTheoGio i : HoaDonTheoGio.getList()) {
            if (ngaySoSanh.format(i.getNgayHoaDon()).equals("09/2013") ) {
                System.out.println(ngaySoSanh.format(i.getNgayHoaDon()));
                tongSoTien += i.thanhTien(, donGia)
            }
        }
        System.out.println(tongSoTien);
    }
}
