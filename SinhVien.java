
package model;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    public String MaSV;
    public String Name;
    public String Email;
    public String SDT;
    public boolean GioiTinh;
    public String Diachi;

    public SinhVien() {
    }

    public SinhVien(String MaSV, String Name, String Email, String SDT, boolean GioiTinh, String Diachi) {
        this.MaSV = MaSV;
        this.Name = Name;
        this.Email = Email;
        this.SDT = SDT;
        this.GioiTinh = GioiTinh;
        this.Diachi = Diachi;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    @Override
    public String toString() {
        return "SinhVien1{" + "MaSV=" + MaSV + ", Name=" + Name + ", Email=" + Email + ", SDT=" + SDT + ", GioiTinh=" + GioiTinh + ", Diachi=" + Diachi + '}';
    }
   
}
