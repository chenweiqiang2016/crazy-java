//package chapter15;

import java.io.File;

public class FileTest{
    public static void main(String[] args){
        File f = new File(".");
        System.out.println(f.getName());//��ӡ��������.
        System.out.println(f.getPath());//��ӡ�Ļ���.
//����File����
       System.out.println(f.getAbsoluteFile());
System.out.println(f.getAbsolutePath());
System.out.println(f.getParent());//����null

System.out.println(f.exists());
System.out.println(f.canRead());
System.out.println(f.canWrite());
System.out.println("�Ƿ����ļ���"+ f.isFile());
System.out.println("�Ƿ���Ŀ¼��"+f.isDirectory());
System.out.println("�Ƿ��Ǿ���·����"+f.isAbsolute());


System.out.println(f.lastModified());//����޸�ʱ��
System.out.println(f.length());


System.out.println(f.list());//����String[]

File newF = new File("cwq.txt");
try{
newF.createNewFile();

newF.delete();

File.createTempFile("mail",".csv", new File("."));
}catch(Exception e){
}





  }
}