package chapter14.self.annotation;

import java.lang.annotation.*;

/**
 * Created by chenweiqiang on 17/3/30.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Test { //没有成员变量 是标注型注解
}
