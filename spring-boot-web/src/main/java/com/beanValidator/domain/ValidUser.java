package com.beanValidator.domain;

import com.beanValidator.MyPhoneValidator;
import lombok.Data;

import javax.validation.constraints.*;

/**
 * 2020/4/9.
 */
@Data
public class ValidUser {

    @Size(max = 10, min = 5)
    @NotNull
    private String name;

    @Max(120)
    @Min(20)
    private int age;

    @Email
    @NotNull    //该注解需要放在最后才起作用
    private String email;

    @MyPhoneValidator   //自定义手机号号码校验器
    @NotNull    //该注解需要放在最后才起作用
    private String phoneNo;

}
