//package chapter15;

import java.io.File;

public class FileTest{
    public static void main(String[] args){
        File f = new File(".");
        System.out.println(f.getName());//打印出来的是.
        System.out.println(f.getPath());//打印的还是.
//返回File对象
       System.out.println(f.getAbsoluteFile());
System.out.println(f.getAbsolutePath());
System.out.println(f.getParent());//返回null

System.out.println(f.exists());
System.out.println(f.canRead());
System.out.println(f.canWrite());
System.out.println("是否是文件："+ f.isFile());
System.out.println("是否是目录："+f.isDirectory());
System.out.println("是否是绝对路径："+f.isAbsolute());


System.out.println(f.lastModified());//最后修改时间
System.out.println(f.length());


System.out.println(f.list());//返回String[]

File newF = new File("cwq.txt");
try{
newF.createNewFile();

newF.delete();

File.createTempFile("mail",".csv", new File("."));
}catch(Exception e){
}





  }
}