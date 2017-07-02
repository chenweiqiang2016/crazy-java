

//Windows机器运行结果
//处理器数量：4
//空闲内存数：61089208
//总内存数：62390272
//可用最大内存数：917504000


public class RuntimeTest{
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        //注意单词的写法 available
        System.out.println("处理器数量：" + rt.availableProcessors());
        System.out.println("空闲内存数：" + rt.freeMemory());
        System.out.println("总内存数：" + rt.totalMemory());
        System.out.println("可用最大内存数：" + rt.maxMemory());
        
        
    }
}