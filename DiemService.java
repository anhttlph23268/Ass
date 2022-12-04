/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.DiemSinhVien;

/**
 *
 * @author lananh
 */
public interface DiemService {
    List<DiemSinhVien> getList();
    void insert(DiemSinhVien sv);
    void setList(ArrayList<DiemSinhVien> list1);
}
