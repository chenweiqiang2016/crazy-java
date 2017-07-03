package chapter7;

//输入一行之后 程序才会显示 每个单词显示为一行
 


import java.util.Scanner;


public class ScannerKeyBoard{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
             System.out.println(scanner.next());
        }
        
    }
}