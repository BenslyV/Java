
public class StaticVsInstanceVariable {
	public int instVar = 20;
	static public int staVar=50;
	 public int insBarcode;
	 public static int staBarcode;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	localVar();
		StaticVsInstanceVariable in = new StaticVsInstanceVariable();
		in.inst();

	}

	static void localVar() {
		int a = 0;
		System.out.println("local variable" + a);
	}

	void inst() {
		/*System.out.println(instVar);
		instVar = 30;
		System.out.println(instVar);
		
		System.out.println("Inst Variables");
		insBarcode=500;
		System.out.println(insBarcode);
		insBarcode=1000;
		System.out.println(insBarcode);
		
		System.out.println("static varibales");
		staBarcode=550;
		System.out.println(staBarcode);
		staBarcode=650;
		System.out.println(staBarcode);*/
		System.out.println("creation of instance");
		StaticVsInstanceVariable is = new StaticVsInstanceVariable();
		is.insBarcode=750;//not working
		insBarcode=1500;
		System.out.println(insBarcode);
		is.insBarcode=850;// not working
		insBarcode=2000;
		System.out.println(insBarcode);
		staBarcode=2500;
		System.out.println(staBarcode);
		staBarcode=3500;
		System.out.println(staBarcode);
		
	}
}
