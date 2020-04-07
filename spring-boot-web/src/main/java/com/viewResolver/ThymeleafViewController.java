package com.viewResolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 2020/4/6.
 * Thymeleaf demo
 */
@Controller
public class ThymeleafViewController {

    @GetMapping("/myspringboot/index")
    public String index(Model model){
        model.addAttribute("name", "myThymeleaf");
        //ThymeleafViewResolver会将路径安装prefix+returnValue+suffix组合后的值寻找相关页面
        //prefix, suffix在properties配置
        return "index";
    }
}
