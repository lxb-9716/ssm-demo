package com.it.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonFactory;
import com.it.ssm.pojo.Admin;
import com.it.ssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    /**
     * 添加数据
     * @return
     */
    @PostMapping(value = "/save", produces = "application/json;charset=UTF-8")
    public String save() {
        Admin admin = new Admin();
        int i = 6;
        admin.setId(++i);
        admin.setUsername("李四" + i);
        admin.setPassword("123456" + i);
        admin.setSubmitTime(new Date());
        adminService.save(admin);
        return "添加数据成功";
    }

    /**
     * 根据id进行条件查询数据
     * @param id
     * @return
     */
    @GetMapping(value = "/findById", produces = "application/json;charset=UTF-8")
    public String findById(@RequestParam(value = "id",required = true) int id) {
        List<Admin> adminList = adminService.findById(id);
        for (Admin admin : adminList) {
            System.out.println(admin);
        }
        String jsonString = JSON.toJSONString(adminList);
        System.out.println("=============将对象转换成json形式数据在页面上展示==============");
        System.out.println(jsonString);
        return jsonString;
    }

    /**
     * 查询所有数据
     * @param
     * @return
     */
    @GetMapping(value = "/findAll", produces = "application/json;charset=UTF-8")
    public String findAll() {
        List<Admin> adminList = adminService.findAll();
        for (Admin admin : adminList) {
            System.out.println(admin);
        }
        String jsonString = JSON.toJSONString(adminList);
        System.out.println("=============将对象转换成json形式数据在页面上展示==============");
        System.out.println(jsonString);
        return jsonString;
    }
}
