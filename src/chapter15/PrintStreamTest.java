import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;

//ʹ��PrintStream���Ը���������
public class PrintStreamTest{
    public static void main(String[] args){
      try(
       FileOutputStream fos = new FileOutputStream("test.txt");
       PrintStream ps = new PrintStream(fos);)
       {
          ps.println("��ͨ�ַ���");
          // ֱ��ʹ��PrintStream�������
          ps.println(new PrintStreamTest());
        }catch(IOException ioe){
          ioe.printStackTrace();
        }

       
}
}