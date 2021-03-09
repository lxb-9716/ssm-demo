package com.it.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/testController")
public class TestController {

    @PostMapping(value = "/test.json", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String test() {
        return "SSM框架整合测试成功!!!";
    }
}
