package com.exceptionHandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 2020/4/6.
 */
@RestController
public class MyExceptionHnadlerController {

    @GetMapping("/myspringboot/adviceException")
    public void adviceException(HttpServletRequest request){
        throw new NullPointerException("故意拋Null异常");
    }
}
