package ThiGiuaKy;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HoaDonTestDrive {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int selection;
        
        HoaDon hoaDonTheoNgay = new HoaDonTheoNgay();
        HoaDon hoaDonTheoGio = new HoaDonTheoGio();

        do {
            System.out.println("-----------------------------------");
            System.out.println("Chuong trinh quan ly hoa don\n");
            System.out.println("(1) Them hoa don");
            System.out.println("(2) Tinh tong so luong hoa don");
            System.out.println("(3) Tinh trung binh theo thang va theo nam");

            System.out.print("\nHay nhap lua chon cua ban: ");

            selection = input.nextInt();
            input.nextLine();
            switch(selection) {
                case 1: {
                    System.out.println("Ban muon them hoa don theo ngay hay theo gio? (0. gio | 1. ngay)");
                    if (input.nextInt() == 0) {
                        hoaDonTheoGio.nhapHoaDon();
                    } else {
                        hoaDonTheoNgay.nhapHoaDon();
                    }
                    break;
                }
                case 2: {
                    System.out.println("Ban muon tinh tong so luong hoa don nao? (0. gio | 1. ngay)");
                    if (input.nextInt() == 0) {
                        System.out.println("Tong so luong hoa don theo gio la: " + hoaDonTheoGio.tongSoLuong());
                    } else {
                        System.out.println("Tong so luong hoa don theo ngay la: " + hoaDonTheoNgay.tongSoLuong());
                    }
                    break;
                }
                case 3: {
                    System.out.println("Hay nhap thang va nam ban muon tinh trung binh thanh tien (dinh dang: thang/nam): ");
                    

                    SimpleDateFormat ngaySoSanh = new SimpleDateFormat("MM/yyyy");
                    Date date = ngaySoSanh.parse(input.nextLine());

                    int tongSoTien = 0;

                    for (HoaDon hoaDon : HoaDon.getList()) {
                        if (ngaySoSanh.format(hoaDon.getNgayHoaDon()).equals(date)) {
                            //tinh tong trung binh
                        }
                    }
                    System.out.println(tongSoTien);
                }
            }
            
        } while (selection > 6 && selection < 1);
    

        

        // hoaDonTheoNgay.setNgayHoaDon(ngayVietNam.parse("1/1/2001"));
        // System.out.println(hoaDonTheoNgay.tongSoLuong());

        // HoaDon hoaDonTheoGio = new HoaDonTheoGio();

        // hoaDonTheoGio.setNgayHoaDon(ngayVietNam.parse("02/09/2013"));
        // hoaDonTheoGio.setDonGia(1000)
        
        
    }
}
