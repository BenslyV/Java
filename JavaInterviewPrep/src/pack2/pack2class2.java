package pack2;

import java.awt.List;
import java.util.ArrayList;

public class pack2class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if(i==35) {
				//break;
				continue;
				System.out.println("print 35");
			}
			
		}

	}
	void UnreachableCode_method(boolean b)
	{
		if(b)
		{
			return;
		}
		else
		{
			//return;
		}

		System.out.println("Unreachable Statement"); 
		//Compile Time Error : Unreachable Code
		/*ArrayList l = new ArrayList();
		l.add("helloe");
		l.add("add1");
		l.ite*/
		
		//String[ ] testData = { “test1” , “test2” , “test3” } ;
		
	}

}
