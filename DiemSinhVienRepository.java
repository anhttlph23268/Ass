package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.DiemSinhVien;

public class DiemSinhVienRepository {

    public ArrayList<DiemSinhVien> getAll() {
        ArrayList<DiemSinhVien> listDNV = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT [id]\n"
                    + "      ,[ma_sv]\n"
                    + "      ,[tieng_anh]\n"
                    + "      ,[tin_hoc]\n"
                    + "      ,[gdtc]\n"
                    + "  FROM [dbo].[diem]";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String maStr = rs.getString("ma_sv");
                String tienganhStr = rs.getString("tieng_anh");
                String tinhocStr = rs.getString("tin_hoc");
                String gdtcStr = rs.getString("gdtc");
                
                DiemSinhVien dsv = new DiemSinhVien(maStr, maStr, 0, 0, 0);
                listDNV.add(dsv);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDNV;
    }
}