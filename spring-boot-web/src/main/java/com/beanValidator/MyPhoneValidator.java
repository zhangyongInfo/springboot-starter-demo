package com.beanValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 2020/4/9.
 */
@Target({ FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {MyConstraint.class })
public @interface MyPhoneValidator {
                                //国际化
    String message() default "{org.my.phoneValidator.errormessage}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
