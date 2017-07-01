//windows下保存为ANSI编码 编译才不会出错

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class StringNodeTest{
    public static void main(String[] args){
        String src = "白日依山尽\n" +
          "黄河入海流\n"  + 
          "欲穷千里目\n"  +
          "更上一层楼\n";
        try(
        StringReader sr = new StringReader(src);)
        {
        char[] buffer = new char[32];
        int hasRead = 0;
        while((hasRead=sr.read(buffer))>0){
            System.out.print(new String(buffer,0,hasRead));
        }}catch(IOException ioe){
        ioe.printStackTrace();
        }

        StringWriter sw = new StringWriter();
        sw.write("这是个美丽的草原\n");
        sw.write("有一个漂亮的菇凉\n");
        System.out.print("下面是StringWriter里面的内容\n");
        System.out.print(sw.toString());

    }
}