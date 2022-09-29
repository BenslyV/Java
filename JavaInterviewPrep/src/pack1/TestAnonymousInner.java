package pack1;

abstract class Person {
	abstract void eat();

	void drink() {
	}
}

public class TestAnonymousInner {
	public static void main(String args[]) {
		Person p = new Person() {

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}

		};
		p.drink();
		p.eat();
	/*	Character ch = new Character();
		ch.getClass();*/
		int [][] ij = new int[][]
	}
	
	
	
}