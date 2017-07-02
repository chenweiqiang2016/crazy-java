//1、不输入参数
//2、输入Java Spring
//3、输入"Java Spring"
public class ArgsTest{
    public static void main(String[] args){
        System.out.println(args.length);
        for(String arg:args){
            System.out.println(arg);
        }
    }
}