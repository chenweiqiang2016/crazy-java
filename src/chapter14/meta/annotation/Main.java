package chapter14.meta.annotation;

import java.lang.annotation.Inherited;

/**
 * Created by chenweiqiang on 17/3/30.
 */

@Inheritable
class Base{

}

public class Main extends Base{
    @Testable
    public void info(){

    }

    public static void main(String[] args){
        //Main类上也是有@Inheritable注解的 但是怎么写判断语句？
    }
}
