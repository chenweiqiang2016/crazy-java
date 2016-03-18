package chapter9.wildcard;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用通配符上限存在的一定问题, 修改成使用泛型下限
 * 造成类型丢失 参考copy2方法
 */

public class ExtendsProblem {
	//复制一个集合
	public static <T> void copy1(Collection<T> dest, Collection<? extends T> src){
		for(T t:src){
			dest.add(t);
		}
	}
	//复制 并且返回最后一个元素
	public static <T> T copy2(Collection<T> dest, Collection<? extends T> src){
		T last = null;
		for(T t:src){
			dest.add(t);
			last=t;
		}
		return last;
	}
	public static void main(String[] args){
		Collection<Number> dest = new ArrayList<>();
		Collection<Integer> src = new ArrayList<>();
		src.add(1);
		//Integer i = copy2(dest, src); //类型已经丢失
		Number n = copy2(dest, src);
	}
}
