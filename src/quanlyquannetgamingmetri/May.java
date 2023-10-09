/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyquannetgamingmetri;

/**
 *
 * @author ADMIN
 */
public class May {
    private int maMay;
    private boolean trangThai;
    private int thoiGianSuDung;
    private double giaTien;

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getThoiGianSuDung() {
        return thoiGianSuDung;
    }

    public void setThoiGianSuDung(int thoiGianSuDung) {
        this.thoiGianSuDung = thoiGianSuDung;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public May(int maMay, boolean trangThai, int thoiGianSuDung, double giaTien) {
        this.maMay = maMay;
        this.trangThai = trangThai;
        this.thoiGianSuDung = thoiGianSuDung;
        this.giaTien = giaTien;
    }

    public void suDungMay() {
        // Đưa logic xử lý sử dụng máy ở đây
    }

    public double tinhTien() {
        // Đưa logic tính tiền sử dụng máy ở đây
        return thoiGianSuDung * giaTien;
    }

    public boolean kiemTraTrangThai() {
        // Đưa logic kiểm tra trạng thái máy ở đây
        return trangThai;
    }
}
