package package2;

public class ClassA1 
{
	int a;//instance variable
	static int b;//static variable====>3
	ClassA1()
	{
		++a;//1
		++b;//3
		System.out.println("a value :"+a);
		System.out.println("b value:"+b);
	}

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
			new ClassA1(); 
			System.out.println("__________");
			new ClassA1();
			System.out.println("__________");
			new ClassA1();
		}
	}


