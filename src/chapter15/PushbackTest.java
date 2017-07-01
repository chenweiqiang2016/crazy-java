import java.io.IOException;
import java.io.PushbackReader;
import java.io.FileReader;

//Ѱ��new PushbackReaderǰ�������
public class PushbackTest{
    public static void main(String[] args){
    try(PushbackReader pushbackReader = new PushbackReader(new FileReader("PushbackTest.java"),64)){
      char[] buffer = new char[32];//���32�е㽲�� Ҫ����Ѱ���ַ����ĳ���
      String lastContent = ""; //����Ҫ����һ��ֵ��
      int hasRead = 0;
      int targetIndex = 0;
      while((hasRead=(pushbackReader.read(buffer))) > 0){


          String content = new String(buffer,0,hasRead);
          String contactStr = lastContent + content;

          if((targetIndex=contactStr.indexOf("new PushbackReader(")) > 0){
              //���¶���һ������ΪtargetIndex������
              if(targetIndex > 32){
                 buffer = new char[targetIndex]; //�����µĽϳ���buffer
              }
              //������bug���� ���򲻽���
              //pushbackReader.unread(contactStr.toCharArray());
              //pushbackReader.read(buffer);
              //System.out.println(buffer);
              
              //���������ݺ��ϴ�����һ���ƻػ�����
              //�ر�ע���������
              pushbackReader.unread(contactStr.toCharArray());

              pushbackReader.read(buffer,0,targetIndex);//���contactStrǰ��Ĳ���

              //��ӡ��ȡ������
              System.out.println("�ҵ�ָ��������");
              System.out.print(new String(buffer, 0, targetIndex));
              System.exit(0); //û����һ��pushback buffer overflow

          }else{
              System.out.println(lastContent);
              lastContent = content;
          }
       


      }
      
    }catch(IOException ioe){
        ioe.printStackTrace();
    }
    
  }
}