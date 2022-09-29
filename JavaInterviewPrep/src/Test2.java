
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("Sharma is a good player");
		String b = "Sharma is a good player";
		if (a == b) {
			System.out.println("a == b");
		}

		else if (a.equals(b)) {
			System.out.println("a equals b");
		}

		else {
			System.out.println("a==b is not working");
		}

		String s = "Sharma is a good player and he is so punctual";
		String words[] = s.split(" ");
		System.out.println("The Number of words present in the string are : " + words.length);
	}

}
