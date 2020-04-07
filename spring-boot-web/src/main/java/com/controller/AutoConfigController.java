package com.controller;

import com.domain.User;
import com.template.FormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/4/4.
 */
@RestController //@RestController=@Controller+@ResponseBody
public class AutoConfigController {

    @Autowired
    FormatTemplate formatTemplate;

    @GetMapping("/myspringboot/sayHello")
    public String sayHelloByFormat(){
        User user = new User("zy",18);
        String str = formatTemplate.getFormatValue(user);
        System.out.println(str);
        return str;
    }
}
