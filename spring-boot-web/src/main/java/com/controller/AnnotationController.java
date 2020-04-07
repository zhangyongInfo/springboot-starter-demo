package com.controller;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 2020/4/6.
 */
@RestController
//@AutoConfigureAfter
//@AutoConfigureBefore
//@AutoConfigureOrder
public class AnnotationController {

//    @GetMapping
//    @PutMapping
//    @PostMapping
//    @DeleteMapping
    public void requestMethod(HttpServletRequest request, HttpServletResponse response){
        request.getAttribute("javax.servlet.error.status_code");
        request.getAttribute("javax.servlet.error.exception");
        request.getAttribute("javax.servlet.error.exception_type");
        request.getAttribute("javax.servlet.error.message");
        request.getAttribute("javax.servlet.error.servlet_name");
    }
}
