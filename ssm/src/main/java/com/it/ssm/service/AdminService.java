package com.it.ssm.service;

import com.it.ssm.pojo.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminService {

    //添加数据
    public void save(Admin admin);

    //根据id查询
    public List<Admin> findById(int id);

    //查询所有数据
    public List<Admin> findAll();
}
