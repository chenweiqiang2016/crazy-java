import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileOutputStreamTest{
public static void main(String[] args) throws IOException{
    FileInputStream fis = new FileInputStream("FileOutputStreamTest.java");
    byte[] buf = new byte[32]; //���ʱ��Сһ����Ե�
    int hasRead = 0;
    FileOutputStream fos = new FileOutputStream("newFile.txt");
    while((hasRead=fis.read(buf))>0){//������д����
     fos.write(buf);
}
fos.close();
}
}