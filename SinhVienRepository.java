package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.DiemSinhVien;
import model.SinhVien;

public class SinhVienRepository {

    public ArrayList<SinhVien> getAll() {
        ArrayList<SinhVien> listSV = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT [ma_sv]\n"
                    + "      ,[ho_ten]\n"
                    + "      ,[email]\n"
                    + "      ,[sdt]\n"
                    + "      ,[gioi_tinh]\n"
                    + "      ,[dia_chi]\n"
                    + "      ,[hinh_anh]\n"
                    + "  FROM [dbo].[sinh_vien]";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String maStr = rs.getString("ma_sv");
                String hoTenStr = rs.getString("ho_ten");
                String emailStr = rs.getString("email");
                int  sdt = rs.getInt("sdt");
                String gioiTinhStr = rs.getString("gioi_tinh");
                String diaChiStr = rs.getString("dia_chi");

               SinhVien sv = new SinhVien(maStr, maStr, emailStr, sql, true, diaChiStr);
                listSV.add(sv);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSV;
    }
}
