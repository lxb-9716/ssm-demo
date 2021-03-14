package com.it.ssm.controller;

import com.it.ssm.mapper.AdminMapperDao;
import com.it.ssm.pojo.Admin;
import com.it.ssm.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class SpringMybatisTest {

    public static void main(String[] args) {
        String admin = findAdminById(6);
        System.out.println(admin);
    }

    public static String findAdminById(@PathVariable("id") Integer id) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminMapperDao adminMapperDao = (AdminMapperDao) classPathXmlApplicationContext.getBean("adminMapperDao");
        List<Admin> adminList = adminMapperDao.findById(id);
        return JsonUtils.objectToJsonString(adminList);
    }
}
