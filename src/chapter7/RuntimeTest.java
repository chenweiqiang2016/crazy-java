

//Windows�������н��
//������������4
//�����ڴ�����61089208
//���ڴ�����62390272
//��������ڴ�����917504000


public class RuntimeTest{
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        //ע�ⵥ�ʵ�д�� available
        System.out.println("������������" + rt.availableProcessors());
        System.out.println("�����ڴ�����" + rt.freeMemory());
        System.out.println("���ڴ�����" + rt.totalMemory());
        System.out.println("��������ڴ�����" + rt.maxMemory());
        
        
    }
}