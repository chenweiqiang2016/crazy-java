import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {
	public static void main(String[] args) {
		// 目标类型是FilenameFilter 实现里面的accept方法
		String[] names = new File(".").list((dir, name) -> name.endsWith(".java") || new File(name).isDirectory());
		for (String name : names) {
			System.out.println(name);
		}
	}
}