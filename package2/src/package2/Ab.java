package package2;

public class Ab {
	int add(int a,int b)
	{
		System.out.println("division="+div(60,5));
		System.out.println("multipication="+multi(20,30));
		System.out.println("Substraction= "+sub(40,20));
		return a+b;
	}
	int sub(int x,int y)
	{
		return x-y;
	}
	int multi(int a, int b)
	{
	
		return a*b;
	}
	int div(int a,int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
	System.out.println("Addition= "+new Ab().add(10,20));	

	}

}
