import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class ScannerFileTest{
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(new File("ScannerFileTest.java"));
        //��ʹ����һ�� ����һ������һ�����ʵ����
        scanner.useDelimiter("\n");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}