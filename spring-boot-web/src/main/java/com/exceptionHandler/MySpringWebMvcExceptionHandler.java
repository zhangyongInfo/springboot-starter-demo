package com.exceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 2020/4/6.
 * springWebMvc异常处理
 */

@RestControllerAdvice(basePackages = "com.controller")
public class MySpringWebMvcExceptionHandler {

    //拦截空指针异常, 如不指定异常类型, 则无需配置异常class, 也可以配置通用异常Exception.class
    //TODO ??还有哪些异常?
    @ExceptionHandler(NullPointerException.class)
//    NoHandlerFoundException.class
    public Object handlerException(HttpServletRequest request, Throwable throwable){
        //javax.servlet.error.status_code
        //该属性给出状态码，状态码可被存储，并在存储为 java.lang.Integer 数据类型后可被分析。
        //2	javax.servlet.error.exception_type
        //该属性给出异常类型的信息，异常类型可被存储，并在存储为 java.lang.Class 数据类型后可被分析。
        //3	javax.servlet.error.message
        //该属性给出确切错误消息的信息，信息可被存储，并在存储为 java.lang.String 数据类型后可被分析。
        //4	javax.servlet.error.request_uri
        //该属性给出有关 URL 调用 Servlet 的信息，信息可被存储，并在存储为 java.lang.String 数据类型后可被分析。
        //5	javax.servlet.error.exception
        //该属性给出异常产生的信息，信息可被存储，并在存储为 java.lang.Throwable 数据类型后可被分析。
        //6	javax.servlet.error.servlet_name
        //该属性给出 Servlet 的名称，名称可被存储，并在存储为 java.lang.String 数据类型后可被分析。
        System.out.println("javax.servlet.error.status_code="+ request.getAttribute("javax.servlet.error.status_code"));
        System.out.println("javax.servlet.error.exception="+ request.getAttribute("javax.servlet.error.exception"));
        System.out.println("javax.servlet.error.exception_type="+ request.getAttribute("javax.servlet.error.exception_type"));
        System.out.println("javax.servlet.error.message="+ request.getAttribute("javax.servlet.error.message"));
        System.out.println("javax.servlet.error.servlet_name="+ request.getAttribute("javax.servlet.error.servlet_name"));
        return throwable.getMessage();
    }
}
