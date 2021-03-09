package com.it.ssm.service.imp;

import com.it.ssm.mapper.AdminMapper;
import com.it.ssm.pojo.Admin;
import com.it.ssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService {
    @Autowired
    private AdminMapper adminMapper;


    public void save(Admin admin) {
        adminMapper.save(admin);
    }


    public List<Admin> findById(int id) {
        return adminMapper.findById(id);
    }

    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }
}
