package service.imp;

import model.DiemSinhVien;
import java.util.ArrayList;
import service.DiemService;

public class DiemServiceImpl implements DiemService{

    private ArrayList<DiemSinhVien> list;

    public DiemServiceImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(DiemSinhVien sv) {
        this.list.add(sv);
    }



    @Override
    public ArrayList<DiemSinhVien> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<DiemSinhVien> list1) {
        this.list = list1;
    }

   
}
