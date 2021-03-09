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
        System.out.println("这是我拉取的一个SSM框架demo整合的ssm_branch01分支，想看一下修改分支的代码，主分支的代码是否会改变");
        System.out.println("修改分支的代码，主分支的代码逻辑不受影响，分支拉取成功了，好开心！！！");
        System.out.println("我又拉取了一个新的分支ssm_branch20210309");
        return "SSM框架整合测试成功!!!";
    }
}
