
package model;



public class DiemSinhVien {

     public String MaSV;
    public String Name;
    public float TiengAnh;
    public float Tinhoc;
    public float GDTC;


    public DiemSinhVien(String MaSV, String Name, float TiengAnh, float Tinhoc, float GDTC) {
        this.MaSV = MaSV;
        this.Name = Name;
        this.TiengAnh = TiengAnh;
        this.Tinhoc = Tinhoc;
        this.GDTC = GDTC;
    }

    public DiemSinhVien() {
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

    public float getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(float TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public float getTinhoc() {
        return Tinhoc;
    }

    public void setTinhoc(float Tinhoc) {
        this.Tinhoc = Tinhoc;
    }

    public float getGDTC() {
        return GDTC;
    }

    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }
public float getDTB(float GDTC ,float Tinhoc,float TiengAnh ){
     float dtb=0;
     dtb=(this.TiengAnh+this.Tinhoc+this.GDTC)/3;
     return dtb;
 }
    @Override
    public String toString() {
        return "SinhVien{" + "MaSV=" + MaSV + ", Name=" + Name + ", TiengAnh=" + TiengAnh + ", Tinhoc=" + Tinhoc + ", GDTC=" + GDTC + '}';
    }
   
}
