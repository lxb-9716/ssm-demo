package com.it.ssm.mapper;

import com.it.ssm.pojo.Admin;
import com.it.ssm.utils.JsonUtils;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminMapperDao extends SqlSessionDaoSupport implements AdminMapper {


    @Override
    public void save(Admin admin) {

    }

    @Override
    public List<Admin> findById(Integer id) {
        SqlSession sqlSession = this.getSqlSession();
        List<Admin> admins = sqlSession.selectList("com.it.ssm.mapper.AdminMapper.findById", id);
        return admins;
    }

    @Override
    public List<Admin> findAll() {
        return null;
    }
}
