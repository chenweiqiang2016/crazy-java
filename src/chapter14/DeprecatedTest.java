package chapter14;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by chenweiqiang on 17/3/28.
 */
public class DeprecatedTest {
    public static void main(String[] args){
        new Orange().info(); //过期的类或方法 不建议使用
    }
}


@Deprecated
class Orange{

    public void info(){
        System.out.println("橘子的info方法");
    }

}
