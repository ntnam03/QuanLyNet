/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyquannetgamingmetri;

/**
 *
 * @author ADMIN
 */
public class NhanVien extends Nguoi {
    private int maNhanVien;
    private String chucVu;
    private double luong;

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public NhanVien(int maNguoi, String tenNguoi, String diaChi, String sdt,
                    int maNhanVien, String chucVu, double luong) {
        super(maNguoi,tenNguoi,diaChi,sdt);
        this.maNhanVien = maNhanVien;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public double tinhLuong() {
        // Đưa logic tính lương ở đây
        return luong;
    }
}

