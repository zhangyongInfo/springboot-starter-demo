package com.beanValidator;

import com.beanValidator.domain.ValidUser;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/4/9.
 */
@RestController
public class MyBeanValidatorController {

    @RequestMapping("/myspringboot/beanValidtor")
    public Object beanValidtor(@Validated  @RequestBody ValidUser validUser){
        return validUser;
    }
}
