package chapter8;

import java.util.stream.IntStream;

/**
 * Stream使用步骤 
 * 1.调用类方法buider()得到Builder
 * 2.使用add增加元素 
 * 3.调用build()方法得到Stream对象
 * 4.使用聚集方法
 */

/*
 * Tip：使用方法引用的方式遍历集合
 */

public class IntStreamTest {
	public static void main(String[] args) {
		IntStream is = IntStream.builder().add(5).add(10).add(3).add(7).build();
     	//System.out.println(is.max()); // 结果是OptionalInt[10]
		//System.out.println(is.max().getAsInt()); //一次调用后流就消失了
        //System.out.println(is.sum());
		//System.out.println(is.map(ele -> ele*2+2)); //输出的是 java.util.stream.IntPipeline$3@548c4f57
		IntStream isNew = is.map(ele -> ele*ele);
		isNew.forEach(System.out::println);
	}

}
