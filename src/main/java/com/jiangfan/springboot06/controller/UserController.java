package com.jiangfan.springboot06.controller;

import com.jiangfan.springboot06.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @Auther: 江帆
 * @Date: 2020/6/25
 * @Description: com.jiangfan.springboot06.controller
 * @version: 1.0
 */
@Controller
public class UserController {

    @RequestMapping(value = "/login")
    public String login(Map map) {
        map.put("userName", "jiangfan");
        map.put("userPass", "<h1>张三</h1>");
        map.put("lists", Arrays.asList("111", "222", "333"));

        return "success";
    }

    @RequestMapping("/testEx")
    @ResponseBody
    public String testEx(@RequestParam("name") String name)

    {
        if (name.equals("aaa")) {
            throw new MyException("用户不存在");

        } else {
            return "hello";
        }

    }
}
