package pack2;
class Base   
{  
    public void baseMethod()  
    {  
        System.out.println("BaseMethod called ...");  
    }  
}  
class Derived extends Base   
{  
    public void baseMethod()  
    {  
        System.out.println("Derived method called ...");  
    }  
    
    public Derived(int a) {
    	
    }
}  
public class Test   
{  
    public static void main (String args[])  
    {  
        Base b = new Derived(10);  
        b.baseMethod();
        
        Derived d = new Derived(0);
        d.baseMethod();
        Base bb = new Base();
        bb.baseMethod();
        
    }  
} 