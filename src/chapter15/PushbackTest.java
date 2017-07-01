import java.io.IOException;
import java.io.PushbackReader;
import java.io.FileReader;

//寻找new PushbackReader前面的内容
public class PushbackTest{
    public static void main(String[] args){
    try(PushbackReader pushbackReader = new PushbackReader(new FileReader("PushbackTest.java"),64)){
      char[] buffer = new char[32];//这个32有点讲究 要大于寻找字符串的长度
      String lastContent = ""; //还是要赋予一个值的
      int hasRead = 0;
      int targetIndex = 0;
      while((hasRead=(pushbackReader.read(buffer))) > 0){


          String content = new String(buffer,0,hasRead);
          String contactStr = lastContent + content;

          if((targetIndex=contactStr.indexOf("new PushbackReader(")) > 0){
              //重新定义一个长度为targetIndex的数组
              if(targetIndex > 32){
                 buffer = new char[targetIndex]; //生成新的较长的buffer
              }
              //以下是bug代码 程序不结束
              //pushbackReader.unread(contactStr.toCharArray());
              //pushbackReader.read(buffer);
              //System.out.println(buffer);
              
              //将本次内容和上次内容一起推回缓冲区
              //特别注意次序问题
              pushbackReader.unread(contactStr.toCharArray());

              pushbackReader.read(buffer,0,targetIndex);//会读contactStr前面的部分

              //打印读取的内容
              System.out.println("找到指定的内容");
              System.out.print(new String(buffer, 0, targetIndex));
              System.exit(0); //没有这一句pushback buffer overflow

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