package chapter15.test;

public class IndexOfTest{
    public static void main(String[] args){
       String a = "ABCDEFG";
       String b = "DE";
       int index = a.indexOf(b);
       char[] c = new char[index];
       System.out.println(a.toCharArray());
    }
}