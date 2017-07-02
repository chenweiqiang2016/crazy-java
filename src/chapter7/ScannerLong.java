import java.util.Scanner;

//ÊäÈë×Ö·û´®»áÍË³ö
public class ScannerLong{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLong()){
            System.out.println(scanner.nextLong());
        }
    }
}