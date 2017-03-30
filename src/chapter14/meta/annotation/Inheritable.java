package chapter14.meta.annotation;

import java.lang.annotation.*;

/**
 * Created by chenweiqiang on 17/3/30.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Inheritable {
}
