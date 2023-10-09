/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyquannetgamingmetri;

/**
 *
 * @author ADMIN
 */
public class Nguoi {
    private int maNguoi;
    private String tenNguoi;
    private String diaChi;
    private String sdt;

    public int getMaNguoi() {
        return maNguoi;
    }

    public void setMaNguoi(int maNguoi) {
        this.maNguoi = maNguoi;
    }

    public String getTenNguoi() {
        return tenNguoi;
    }

    public void setTenNguoi(String tenNguoi) {
        this.tenNguoi = tenNguoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Nguoi(int maNguoi, String tenNguoi, String diaChi, String sdt) {
        this.maNguoi = maNguoi;
        this.tenNguoi = tenNguoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public void goiDichVu(DichVu dv) {
        // Đưa logic xử lý gọi dịch vụ ở đây
    }
}

