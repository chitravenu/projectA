package package2;

public class Class1
{
        static int a=Class1.meth1();
        static int meth1()
        {
        	System.out.println("meth() called");
        	return 100;
        }
  
	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
		System.out.println("from mai():"+a);
	}
  static
  {
	  System.out.println("from static block;"+a);
  }
}
