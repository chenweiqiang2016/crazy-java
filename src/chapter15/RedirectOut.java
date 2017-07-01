import java.io.IOException;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class RedirectOut{
    public static void main(String[] args){
        try(
        PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));){
             System.setOut(ps);
             System.out.println("ÕâÊÇÆÕÍ¨×Ö·û´®");
             System.out.println(new RedirectOut());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}