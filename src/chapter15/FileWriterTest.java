import java.io.FileWriter;
import java.io.IOException;

//ֱ��д�ַ���
public class FileWriterTest{
    public static void main(String[] args){

try
      (FileWriter fw = new FileWriter("pom.txt");){
      fw.write("��ҹ˼ \r\n");
fw.write("��ǰ���¹⣬���ǵ���˪��\r\n");
fw.write("��ͷ�����£���ͷ˼���硣\r\n");
}catch(IOException ioe){
ioe.printStackTrace();
}
}
}