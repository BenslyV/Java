package pack1;

class Bike {
	 void run() {
		System.out.println("running");
	}
}

public class Honda extends Bike {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Bike honda = new Honda();
		honda.run();
		
		Bike b = new Bike();
		b.run();
		
		Honda h = new Honda();
		h.run();
		
		
	}
}