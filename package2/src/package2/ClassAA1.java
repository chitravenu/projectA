package package2;

public class ClassAA1
{
    static int x=10;
    static int y=20;
    
    static void m1()
    {
    	int x=100;
    	System.out.println("--------test11 SBI called------");
    	System.out.println(("X;"+x));
    	System.out.println("Y;"+y);
    }
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		m1();
	}
	static
	{
		System.out.println("----test11 SB2 called-----");
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		
	}

}
