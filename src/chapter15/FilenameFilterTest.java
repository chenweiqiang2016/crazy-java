import java.io.File;
import java.io.FilenameFilter;


public class FilenameFilterTest{
    public static void main(String[] args){
//Ŀ��������FilenameFilter ʵ�������accept����
String[] names = new File(".").list((dir,name) -> name.endsWith(".java") || new  File(name).isDirectory());
for(String name:names){
System.out.println(name);
}
}
}