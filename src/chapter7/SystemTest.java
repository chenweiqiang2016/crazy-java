package chapter7;

import java.util.Map;
import java.util.Properties;
import java.io.FileOutputStream;

public class SystemTest{
    public static void main(String[] args) throws Exception{
        //获取系统所有的环境变量
        Map<String, String> env = System.getenv();
        for(String name:env.keySet()){
            System.out.println(name + " ---> " + env.get(name));
        }
       System.out.println("获取指定环境变量:" + System.getenv("OS"));

       //获取所有的系统属性
       Properties props = System.getProperties();
       props.store(new FileOutputStream("props.txt"), "System.Properties");
       //输出特定的系统属性
       System.out.println(System.getProperty("os.name"));
    }
}