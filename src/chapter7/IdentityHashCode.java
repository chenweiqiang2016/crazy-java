//�������õķ��� �����ж����������Ƿ���ͬһ������
public class IdentityHashCode{
    public static void main(String[] args){
        String s1 = new String("hello");
        String s2 = new String("hello");
        //�����ַ����м���hashCode ��ͬ�Ķ���hashCode��ͬ
        System.out.println(s1.hashCode() + " <--> " + s2.hashCode());
        System.out.println(System.identityHashCode(s1) + " <--> " + System.identityHashCode(s2));
       
        String s3 = "Java";
        String s4 = "Java";
        System.out.println(System.identityHashCode(s3) + " <--> " + System.identityHashCode(s4));
    }
}