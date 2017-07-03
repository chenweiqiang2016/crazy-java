package chapter7;

import java.util.Scanner;

//遇到字符串输入 程序会退出
public class ScannerLong{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLong()){
            System.out.println(scanner.nextLong());
        }
    }
}