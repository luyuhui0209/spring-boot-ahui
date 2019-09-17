package com.ahui.aspect;

import java.lang.annotation.*;

/**
 * 日志 自定义注解
 *
 * @Author luyuhui
 * @Date 2019-09-17 11:32
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface WebLog {
    /**
     * 日志描述信息
     *
     * @return
     */
    String description() default "";

}
