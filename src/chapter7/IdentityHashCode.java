//这是有用的方法 可以判断两个对象是否是同一个对象
public class IdentityHashCode{
    public static void main(String[] args){
        String s1 = new String("hello");
        String s2 = new String("hello");
        //根据字符序列计算hashCode 不同的对象hashCode相同
        System.out.println(s1.hashCode() + " <--> " + s2.hashCode());
        System.out.println(System.identityHashCode(s1) + " <--> " + System.identityHashCode(s2));
       
        String s3 = "Java";
        String s4 = "Java";
        System.out.println(System.identityHashCode(s3) + " <--> " + System.identityHashCode(s4));
    }
}