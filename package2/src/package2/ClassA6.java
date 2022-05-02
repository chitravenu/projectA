package package2;

public class ClassA6 
{
	  static int x=m1();//100

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		System.out.println(ClassA6.x);
	}
 static
 {
	 System.out.println(x);//100
	 ClassA6.x=x+20;
 }
 static int m1()
 {
	 ClassA6.x=50;
	 return m2();//100
 }
static int m2()
{
	System.out.println(ClassA6.x);
	return 100;
}
}

