package com.jiangfan.springboot06.controller;

import com.jiangfan.springboot06.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 江帆
 * @Date: 2020/6/30
 * @Description: com.jiangfan.springboot06.controller
 * @version: 1.0
 */
@ControllerAdvice
public class ExceptionController {
/*    @ResponseBody
    @ExceptionHandler(MyException.class)
    public Map<String, Object> handlerException(MyException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", -100);
        map.put("message", e.getMessage());
        return map;

    }*/

    @ExceptionHandler(MyException.class)
    public  String handlerException(MyException e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", -100);
        map.put("message", e.getMessage());
        return "forward:/error";

    }
}
