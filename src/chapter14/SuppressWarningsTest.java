package chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenweiqiang on 17/3/28.
 */

@SuppressWarnings("unchecked") //不报任何类型的警告
public class SuppressWarningsTest {
    public static void main(String[] args){
        List l = new ArrayList<Integer>();
        l.add(20);
        List<String> l2 = l; //未指定类型 赋值给 有类型的 会有警告
    }

}
