
//单独起一个进程

public class ExecTest{
    public static void main(String[] args) throws Exception{
        Runtime rt = Runtime.getRuntime();
        //运行记事本程序
        rt.exec("C:\\Program Files (x86)\\IQIYI Video\\LStyle\\5.6.40.4071\\QyClient.exe");
    }
}