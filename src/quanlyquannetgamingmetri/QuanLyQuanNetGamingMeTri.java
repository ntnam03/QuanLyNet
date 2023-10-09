/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlyquannetgamingmetri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLyQuanNetGamingMeTri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        List<Nguoi> danhSachNguoi = new ArrayList<>();
        List<May> danhSachMay = new ArrayList<>();
        List<DichVu> danhSachDichVu = new ArrayList<>();

        // Tạo và thêm đối tượng vào danh sách
        NhanVien nhanVien1 = new NhanVien(1, "Nguyen Van A", "Dia chi A", "123456", 101, "Quan ly", 5000);
        danhSachNguoi.add(nhanVien1);

        ThanhVien thanhVien1 = new ThanhVien(2, "Nguyen Van B", "Dia chi B", "7891011", 201, new Date(), new Date());
        danhSachNguoi.add(thanhVien1);

        May may1 = new May(1, true, 0, 2.5);
        danhSachMay.add(may1);

        DichVu dichVu1 = new DichVu(1, "Do an", 10.0);
        DichVu dichVu2 = new DichVu(2, "Do uong", 5.0);
        danhSachDichVu.add(dichVu1);
        danhSachDichVu.add(dichVu2);

        // Tạo đối tượng QuanNet và thêm các danh sách vào đó
        QuanNet quanNet = new QuanNet();
        quanNet.themNguoi(nhanVien1);
        quanNet.themNguoi(thanhVien1);
        quanNet.themMay(may1);
        quanNet.themDichVu(dichVu1);
        quanNet.themDichVu(dichVu2);

        // Thực hiện các thao tác khác trên đối tượng QuanNet
        // Ví dụ: Xóa một đối tượng khỏi danh sách
        quanNet.xoaNguoi(nhanVien1);

        // Hiển thị thông tin của các đối tượng
        System.out.println("Danh sach nguoi trong QuanNet:");
        for (Nguoi nguoi : quanNet.getDanhSachNguoi()) {
            System.out.println("Ten: " + nguoi.getTenNguoi());
        }

        System.out.println("\nDanh sach may trong QuanNet:");
        for (May may : quanNet.getDanhSachMay()) {
            System.out.println("Ma may: " + may.getMaMay());
        }

        System.out.println("\nDanh sach dich vu trong QuanNet:");
        for (DichVu dv : quanNet.getDanhSachDichVu()) {
            System.out.println("Ten dich vu: " + dv.getTenDichVu());
            
        }
        Scanner scanner = new Scanner(System.in);
        int luaChon;

       

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Hien thi danh sach nguoi");
            System.out.println("2. Hien thi danh sach may");
            System.out.println("3. Hien thi danh sach dich vu");
            System.out.println("4. Them nguoi");
            System.out.println("5. Them may");
            System.out.println("6. Them dich vu");
            System.out.println("7. Thoat");

            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    // Hiển thị danh sách người
                    System.out.println("Danh sach nguoi trong QuanNet:");
                    for (Nguoi nguoi : quanNet.getDanhSachNguoi()) {
                        System.out.println("Tên: " + nguoi.getTenNguoi());
                    }
                    break;
                case 2:
                    // Hiển thị danh sách máy
                    System.out.println("Danh sach may trong QuanNet:");
                    for (May may : quanNet.getDanhSachMay()) {
                        System.out.println(" Ma may: " + may.getMaMay());
                    }
                    break;
                case 3:
                    // Hiển thị danh sách dịch vụ
                    System.out.println("Danh sach dich vu trong QuanNet:");
                    for (DichVu dv : quanNet.getDanhSachDichVu()) {
                        System.out.println("Ten dich vu: " + dv.getTenDichVu());
                    }
                    break;
                case 4:
                     // Thêm người
                    System.out.print("Nhap thong tin nguoi moi:\n");
                    System.out.print("Ma nguoi: ");
                    int maNguoi = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống để xử lý lỗi
                    System.out.print("Ten nguoi: ");
                    String tenNguoi = scanner.nextLine();
                    System.out.print("Dia chi: ");
                    String diaChi = scanner.nextLine();
                    System.out.print("So dien thoai: ");
                    String soDienThoai = scanner.nextLine();
                    System.out.print("Loai nguoi (1: Nhan vien, 2: Thanh vien): ");
                    int loaiNguoi = scanner.nextInt();

                    if (loaiNguoi == 1) {
                        // Nếu là Nhân viên
                        System.out.print("Chuc vu: ");
                        scanner.nextLine(); // Đọc dòng trống để xử lý lỗi
                        String chucVu = scanner.nextLine();
                        System.out.print("Luong: ");
                        double luong = scanner.nextDouble();
                        NhanVien nhanVienMoi = new NhanVien(maNguoi, tenNguoi, diaChi, soDienThoai, loaiNguoi, chucVu, luong);
                        quanNet.themNguoi(nhanVienMoi);
                    } else if (loaiNguoi == 2) {
                        // Nếu là Thành viên
                        ThanhVien thanhVienMoi = new ThanhVien(maNguoi, tenNguoi, diaChi, soDienThoai, loaiNguoi, new Date(), new Date());
                        quanNet.themNguoi(thanhVienMoi);
                    } else {
                        System.out.println("Lua chon loai nguoi khong hop.");
                    }
                    break;
          
                case 5:
                    // Thêm máy
                    System.out.print("Nhap thong tin may moi:\n");
                    System.out.print("Ma may: ");
                    int maMay = scanner.nextInt();
                    System.out.print("Trang thai (true: Dang su dung, false: Khong su dung): ");
                    boolean trangThai = scanner.nextBoolean();
                    System.out.print("So gio su dung: ");
                    int soGioSuDung = scanner.nextInt();
                    System.out.print("Toc do (Mbps): ");
                    double tocDo = scanner.nextDouble();

                    May mayMoi = new May(maMay, trangThai, soGioSuDung, tocDo);
                    quanNet.themMay(mayMoi);
                    break;

                case 6:
                    // Thêm dịch vụ
                    System.out.print("Nhap thong tin dich vu moi:\n");
                    System.out.print("Ma dich vu: ");
                    int maDichVu = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống để xử lý lỗi
                    System.out.print("Ten dich vu: ");
                    String tenDichVu = scanner.nextLine();
                    System.out.print("Gia dich vu: ");
                    double giaDichVu = scanner.nextDouble();

                    DichVu dichVuMoi = new DichVu(maDichVu, tenDichVu, giaDichVu);
                    quanNet.themDichVu(dichVuMoi);
                    break;

                case 7:
                    System.out.println("Chuong trinh ket thuc.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                    break;
            }
        } while (luaChon != 7);

        System.in.close();
    }
}