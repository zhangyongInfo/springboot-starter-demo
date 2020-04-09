package com.beanValidator.domain;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 2020/4/9.
 */
@Data
public class ValidUser {

    @NotNull
    private String name;

    @Max(120)
    @Min(20)
    private int age;

}
