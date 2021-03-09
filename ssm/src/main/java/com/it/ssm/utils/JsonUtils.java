package com.it.ssm.utils;

import com.alibaba.fastjson.JSON;

public class JsonUtils {

    /* 对象转JSON*/
    public static String objectToJsonString(Object object) {
        return JSON.toJSONString(object);
    }

    /*JSON转对象*/
    public static Object jsonToObject(String json) {
        return JSON.parse(json);
    }
}
