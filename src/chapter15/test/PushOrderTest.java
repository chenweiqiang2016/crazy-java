package chapter15.test;

import java.io.PushbackReader;
import java.io.FileReader;
import java.io.IOException;

public class PushOrderTest{
    public static void main(String[] args) throws IOException{
        PushbackReader ps = new PushbackReader(new FileReader("PushOrderTest.java"),5);
        char[] a = new char[5];
        char[] b = new char[2]; 
        ps.read(a);
        ps.unread(a);
        ps.read(b);
        System.out.println(b);
    }
}