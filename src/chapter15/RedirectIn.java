import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class RedirectIn{
    public static void main(String[] args){
        try(
        FileInputStream fis= new FileInputStream("RedirectIn.java");){
            System.setIn(fis);
            //创建Scanner对象 获取标准输入
            Scanner scanner = new Scanner(System.in);
            //把回车作为分隔符
            scanner.useDelimiter("\n");
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}