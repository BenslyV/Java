package pack2;
class Base   
{  
    protected final void getInfo()  
    {  
        System.out.println("method of Base class");  
    }  
}  
   
public class Derived extends Base  
{  
    protected final void getInfo()  
    {  
        System.out.println("method of Derived class");  
    }  
    public static void main(String[] args)  
    {  
        Base obj = new Base();  
        obj.getInfo();  
    }  
}  
