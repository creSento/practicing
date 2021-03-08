
public class Method {

	public static void main(String[] args) {

		Method main = new Method();
		int a = 12;
		int b = 5;
		int sum = main.plus(a, b);
		int minus = main.minus(a, b);
		int multi = multi(a, b);
		int div = divide(a, b);

		System.out.println(a + "+" + b + "=" + sum);
		System.out.println(a + "-" + b + "=" + minus);
		System.out.println(a + "*" + b + "=" + multi);
		System.out.println(a + "/" + b + "=" + div);

	}

	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	
	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}
	
	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}

}
