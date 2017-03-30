package chapter14;

import java.util.Arrays;

/**
 * Created by chenweiqiang on 17/3/30.
 */
public class ErrorUtilsTest {
    public static void main(String[] args){
        ErrorUtils.faultyMethod(Arrays.asList("java"), Arrays.asList("spring"));
    }
}
