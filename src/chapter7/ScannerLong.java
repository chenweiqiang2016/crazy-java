import java.util.Scanner;

//�����ַ������˳�
public class ScannerLong{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLong()){
            System.out.println(scanner.nextLong());
        }
    }
}