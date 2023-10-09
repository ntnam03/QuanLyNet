/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyquannetgamingmetri;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.List;

public class QuanNet {
    private List<Nguoi> danhSachNguoi;
    private List<May> danhSachMay;
    private List<DichVu> danhSachDichVu;

    public List<Nguoi> getDanhSachNguoi() {
        return danhSachNguoi;
    }

    public void setDanhSachNguoi(List<Nguoi> danhSachNguoi) {
        this.danhSachNguoi = danhSachNguoi;
    }

    public List<May> getDanhSachMay() {
        return danhSachMay;
    }

    public void setDanhSachMay(List<May> danhSachMay) {
        this.danhSachMay = danhSachMay;
    }

    public List<DichVu> getDanhSachDichVu() {
        return danhSachDichVu;
    }

    public void setDanhSachDichVu(List<DichVu> danhSachDichVu) {
        this.danhSachDichVu = danhSachDichVu;
    }

    public QuanNet() {
        danhSachNguoi = new ArrayList<>();
        danhSachMay = new ArrayList<>();
        danhSachDichVu = new ArrayList<>();
    }

    public void themNguoi(Nguoi nguoi) {
        danhSachNguoi.add(nguoi);
    }

    public void themMay(May may) {
        danhSachMay.add(may);
    }

    public void themDichVu(DichVu dichvu) {
        danhSachDichVu.add(dichvu);
    }

    public void xoaNguoi(Nguoi nguoi) {
        danhSachNguoi.remove(nguoi);
    }

    public void xoaMay(May may) {
        danhSachMay.remove(may);
    }

    public void xoaDichVu(DichVu dichvu) {
        danhSachDichVu.remove(dichvu);
    }
}
