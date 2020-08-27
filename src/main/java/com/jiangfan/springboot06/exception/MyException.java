package com.jiangfan.springboot06.exception;

import org.springframework.context.annotation.Configuration;

/**
 * @Auther: 江帆
 * @Date: 2020/6/30
 * @Description: com.jiangfan.springboot06.exception
 * @version: 1.0
 */
public class MyException extends RuntimeException {
    public MyException() {
        super();

    }

    public MyException(String message) {
        super(message);

    }
}
