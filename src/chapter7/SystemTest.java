import java.util.Map;
import java.util.Properties;
import java.io.FileOutputStream;

public class SystemTest{
    public static void main(String[] args) throws Exception{
        //��ȡϵͳ���еĻ�������
        Map<String, String> env = System.getenv();
        for(String name:env.keySet()){
            System.out.println(name + " ---> " + env.get(name));
        }
       System.out.println("��ȡָ����������:" + System.getenv("OS"));

       //��ȡ���е�ϵͳ����
       Properties props = System.getProperties();
       props.store(new FileOutputStream("props.txt"), "System.Properties");
       //����ض���ϵͳ����
       System.out.println(System.getProperty("os.name"));
    }
}