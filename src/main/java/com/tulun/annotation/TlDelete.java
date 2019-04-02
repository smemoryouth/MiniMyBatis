package com.tulun.annotation;

import java.lang.annotation.*;

/**
 * description：
 *
 * @author ajie
 * data 2018/11/15 21:20
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TlDelete {
    String value();
}

