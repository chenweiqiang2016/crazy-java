package chapter14.meta.annotation;

import java.lang.annotation.*;

/**
 * Created by chenweiqiang on 17/3/30.
 */

@Retention(RetentionPolicy.RUNTIME) //保存在class文件中 可以访问注解信息
//@Retention(RetentionPolicy.CLASS)  保存在class文件中 访问不到注解信息
//@Retention(RetentionPolicy.SOURCE) 保存在源文件中

@Target(ElementType.METHOD) //用于修饰方法
//@Target(ElementType.FIELD) //用于修饰成员变量

@Documented //使用Javac生成API文档时 @Testable会在文档中出现
public @interface Testable {
}
