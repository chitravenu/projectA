package package2;

public class ClassB1 
{ 
	static int x=10;
	public static void main(String[] args)
	{
		ClassB1 t1=new ClassB1();
		ClassB1 t2=new ClassB1();
		t1.x=20;
		System.out.println(x+"");
		System.out.println(t2.x);
	}
}
	