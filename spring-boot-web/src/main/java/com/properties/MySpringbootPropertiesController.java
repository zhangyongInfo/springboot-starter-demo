package com.properties;

import com.template.FormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/4/7.
 */
@RestController
public class MySpringbootPropertiesController {

    @Autowired
    private MySpringbootProperties properties;

    @Autowired
    FormatTemplate formatTemplate;

    @GetMapping("/myspringboot/myProperties")
    public String sayHelloByFormat(){
        String str = formatTemplate.getFormatValue(properties);
        System.out.println(str);
        return str;
    }
}
