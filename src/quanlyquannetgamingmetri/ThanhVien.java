/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyquannetgamingmetri;

/**
 *
 * @author ADMIN
 */
import java.util.Date;

public class ThanhVien extends Nguoi {
    private int maThanhVien;
    private Date ngayDangKy;
    private Date hanDung;

    public int getMaThanhVien() {
        return maThanhVien;
    }

    public void setMaThanhVien(int maThanhVien) {
        this.maThanhVien = maThanhVien;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public Date getHanDung() {
        return hanDung;
    }

    public void setHanDung(Date hanDung) {
        this.hanDung = hanDung;
    }

    public ThanhVien(int maNguoi, String tenNguoi, String diaChi, String sdt,
                     int maThanhVien, Date ngayDangKy, Date hanDung) {
        super(maNguoi, tenNguoi, diaChi, sdt);
        this.maThanhVien = maThanhVien;
        this.ngayDangKy = ngayDangKy;
        this.hanDung = hanDung;
    }

    public boolean kiemTraHanDung() {
        // Đưa logic kiểm tra hạn dùng thành viên ở đây
        return true; // Hoặc false tùy vào logic của bạn
    }
}

