package package2;

public class ClassD 
{
	void meth1()
	{
		int a=10;
		System.out.println(a++);//10 a=11
		System.out.println(a++);//11 a=12
		System.out.println(a++  +3);//12+3=15  a=13
		System.out.println(a);//13
		System.out.println(++a);//14
		System.out.println(++a  +3);//15+3=18 a=15
		System.out.println(a--);//15
		System.out.println(a);//14
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new ClassD().meth1();
	}

}
