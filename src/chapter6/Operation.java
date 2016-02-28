package chapter6;

/**
 * 抽象方法导致枚举类变成抽象类 但是每个枚举值必须实现抽象方法 因为枚举类不是仅仅作为父类 它需要显式生成每一个枚举值
 * 意外发现: 每一个匿名子类都拥有main方法
 */

public enum Operation {
	PLUS{
		public double eval(double x, double y){
			return x+y;
		}
	},
	MINUS{
		public double eval(double x, double y){
			return x-y;
		}
	},
	TIMES{
		public double eval(double x, double y){
			return x*y;
		}
	},
	DIVIDE{
		public double eval(double x, double y){
			return x/y;
		}
	};
	public abstract double eval(double x, double y);
	
	public static void main(String[] args){
		System.out.println(Enum.valueOf(Operation.class, "PLUS").eval(2, 5));
		System.out.println(Enum.valueOf(Operation.class, "MINUS").eval(2, 5));
		System.out.println(Enum.valueOf(Operation.class, "TIMES").eval(2, 5));
		System.out.println(Enum.valueOf(Operation.class, "DIVIDE").eval(2, 5));
	}

}
