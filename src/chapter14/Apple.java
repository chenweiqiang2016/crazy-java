package chapter14;

/**
 * Created by chenweiqiang on 17/3/28.
 */

class Fruit{
    public void info(){
        System.out.println("水果的info方法");
    }
}

public class Apple extends Fruit{
    //写错方法名也没有关系 //@Override
    @Override //Error:(15, 5) java: 方法不会覆盖或实现超类型的方法
    public void info(){//inf0(){
        System.out.println("苹果覆载父类的info方法");
    }

    public static void main(String[] args){
        new Apple().info();
    }
}
