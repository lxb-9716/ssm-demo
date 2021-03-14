package com.it.ssm.mapper;

import com.it.ssm.pojo.Admin;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public interface AdminMapper {
    //添加
    public void save(Admin admin);

    //根据id查询
    public List<Admin> findById(Integer id);

    //查询所有数据
    public List<Admin> findAll();
}
