package com.spring.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author wpq
 * @date 2018/3/9 10:39
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {

    /**
     * 表示访问该方法的url
     * @return
     */
    String value() default "";
}
