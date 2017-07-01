import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;

//使用PrintStream可以更方便的输出
public class PrintStreamTest{
    public static void main(String[] args){
      try(
       FileOutputStream fos = new FileOutputStream("test.txt");
       PrintStream ps = new PrintStream(fos);)
       {
          ps.println("普通字符串");
          // 直接使用PrintStream输出对象
          ps.println(new PrintStreamTest());
        }catch(IOException ioe){
          ioe.printStackTrace();
        }

       
}
}