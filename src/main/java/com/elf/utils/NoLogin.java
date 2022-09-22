package com.elf.utils;


import java.lang.annotation.*;

//注解表示:该注解只能在METHOD(方法类)与TYPE(接口，注解，enum)上使用
@Target({
        ElementType.METHOD, ElementType.TYPE
})
//注解表示:保留至运行时，可以被反射读取。
@Retention(RetentionPolicy.RUNTIME)
//注解表示:注解是否能被 javadoc 处理并保留在文档中。
@Documented
/**
 * 用于标注被该注解的类，方法等可以在未登录的情况下使用
 */
public @interface NoLogin {
}
