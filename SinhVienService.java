/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.DiemSinhVien;
import model.SinhVien;

/**
 *
 * @author lananh
 */
public interface SinhVienService {
        List<SinhVien> getList();
    void insert(SinhVien sv);
    void setList(ArrayList<SinhVien> list);
}
