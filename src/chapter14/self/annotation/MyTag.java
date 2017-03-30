package chapter14.self.annotation;

import java.lang.annotation.*;

/**
 * Created by chenweiqiang on 17/3/30.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MyTag { //两个成员变量 有成员变量元注解

    String name() default "chenweiqiang";

    int age() default 25;

}
