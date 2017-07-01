import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class RedirectIn{
    public static void main(String[] args){
        try(
        FileInputStream fis= new FileInputStream("RedirectIn.java");){
            System.setIn(fis);
            //����Scanner���� ��ȡ��׼����
            Scanner scanner = new Scanner(System.in);
            //�ѻس���Ϊ�ָ���
            scanner.useDelimiter("\n");
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}