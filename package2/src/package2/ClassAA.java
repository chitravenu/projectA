package package2;

public class ClassAA {
	int meth1(int a,int b,int c)
	{
         c=a+b;
         return c;
	}
	
int meth2(int x, int y)
{
	return 0;
}
ClassAA()
{
	System.out.println("multificatio:"+(5*10));
}
ClassAA(int m, int n)
{
	System.out.println("division:"+m/n);
}
ClassAA(int m)
{
	System.out.println("division;"+m/2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("additin;"+new ClassAA().meth1(2, 3, 1));
System.out.println("subsraction;"+new ClassAA().meth2(5, 5));
	}

}
