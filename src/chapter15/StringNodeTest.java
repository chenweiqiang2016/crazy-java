//windows�±���ΪANSI���� ����Ų������

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class StringNodeTest{
    public static void main(String[] args){
        String src = "������ɽ��\n" +
          "�ƺ��뺣��\n"  + 
          "����ǧ��Ŀ\n"  +
          "����һ��¥\n";
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
        sw.write("���Ǹ������Ĳ�ԭ\n");
        sw.write("��һ��Ư���Ĺ���\n");
        System.out.print("������StringWriter���������\n");
        System.out.print(sw.toString());

    }
}