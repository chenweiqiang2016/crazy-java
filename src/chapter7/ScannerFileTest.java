import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class ScannerFileTest{
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(new File("ScannerFileTest.java"));
        //不使用这一行 将会一个单词一个单词的输出
        scanner.useDelimiter("\n");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}