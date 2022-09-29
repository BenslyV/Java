
public class New1 {
	public static void main(String[] args) {
		String str = "hello world";

		System.out.println(str.length());
		/*
		 * System.out.println(str.charAt(0)); System.out.println(str.charAt(10));
		 */
		System.out.println("outside for");
		int strlen= str.length() - 1;
		for (int i= strlen ; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
