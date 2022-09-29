import java.util.*;

class TestJavaCollection1 {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		// Traversing list through Iterator
		@SuppressWarnings("rawtypes")
		Iterator itr = list.iterator();
		//Enumeration enum=list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		@SuppressWarnings("rawtypes")
		ArrayList arrlist = new ArrayList();
		arrlist.add("Sunday");
		arrlist.add("Monday");
		arrlist.add("Tuesday");
		arrlist.add("Wednesday");
		arrlist.add("Thursday");
		arrlist.add("Friday");
		arrlist.add("Saturday");
		//using for-each loop
	      System.out.println("\nUsing for-each loop\n");	
	      for (Object object : arrlist) {
			System.out.println(object);
		}
	      /*for (String str : arrlist)
	      { 		      
	           System.out.println(str); 		
	      }*/
		
		System.out.println("Using For Loop\n ");
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}
		
	}

}