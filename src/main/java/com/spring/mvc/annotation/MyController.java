package com.spring.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author wpq
 * @date 2018/3/9 10:39
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {

    /**
     * 表示给controller注册别名
     * @return
     */
    String value() default "";
}
