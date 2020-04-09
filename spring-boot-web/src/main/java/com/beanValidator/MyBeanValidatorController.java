package com.beanValidator;

import com.beanValidator.domain.ValidUser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 2020/4/9.
 */
@RestController
public class MyBeanValidatorController {

    @RequestMapping("/myspringboot/beanValidtor")
    public Object beanValidtor(@Valid @RequestBody ValidUser validUser){
        return validUser;
    }
}
