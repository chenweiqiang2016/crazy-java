package chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenweiqiang on 17/3/30.
 */
public class ErrorUtils {
    @SafeVarargs //messages里面不在显示警告
    public static void faultyMethod(List<String>... listStrArray){
        List[] listArray = listStrArray; //数组不能保存范型 已经发生堆污染

        List<Integer> myList = new ArrayList<>();
        myList.add(20);
        listArray[0] = myList;

//        String s = listStrArray[0].get(0); //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        System.out.println(listStrArray[0]); //注意 .get(0) 会报错
        System.out.println(listStrArray[1].get(0));
    }
}
