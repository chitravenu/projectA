package package2;
//*wap take a parameterized constructor with two int values and print greatest among them*//
public class ClassAA3 
{
	ClassAA3(int a, int b)
	{
		if (a>b)
			System.out.println(a+"is biggest of "+b);
		else
			System.out.println(b+"is biggest then "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new ClassAA3(50,60);
	}

}
