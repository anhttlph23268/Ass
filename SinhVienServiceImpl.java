/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.imp;

import java.util.ArrayList;
import model.DiemSinhVien;
import model.SinhVien;
import service.SinhVienService;

/**
 *
 * @author lananh
 */
public class SinhVienServiceImpl implements SinhVienService{
    private ArrayList<SinhVien> list;

    public SinhVienServiceImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(SinhVien sv) {
        this.list.add(sv);
    }



    @Override
    public ArrayList<SinhVien> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<SinhVien> list1) {
        this.list = list1;
    }

}
