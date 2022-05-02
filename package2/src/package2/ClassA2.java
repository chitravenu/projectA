package package2;

public class ClassA2 
{
	int a=10;
	static int b=20;
	void meth1()
	{
		System.out.println("-----instance variabe-------");
		System.out.println("instance variable:"+a);
		System.out.println("static variable:"+b);
	}
static void meth2()
{
	System.out.println("----static method-----");
	System.out.println("instance variable:"+new ClassA2());
	System.out.println("static variable :"+b);
}
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		new ClassA2().meth1();
		//new ClassA2.meth2();//with the help of class object
		//meth2();//directly by using identifier name
		ClassA2.meth2();//with the help of class name
		//ClaasA2.mth1()://C.E because we con't call an instance method with the help of CLAS NAME.
		
	}

}
