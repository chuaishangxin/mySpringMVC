package com.spring.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author wpq
 * @date 2018/3/9 10:39
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {

    String value();
}
