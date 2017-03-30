package chapter14;

/**
 * Created by chenweiqiang on 17/3/30.
 */
@FunctionalInterface
public interface FunInterface {

    static void info(){
        System.out.println("类方法");
    }

    default void roll(){
        System.out.println("默认方法");
    }

    public void abc();

    //public void lmn();
}
