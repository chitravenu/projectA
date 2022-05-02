package package2;

public class ClassC {
	
	private static final String s = null;

	public ClassC()
	{
		System.out.println("sunday");
		ClassC obj=new ClassC(10);
		System.out.println("thuesday");
		String s = obj.display("challenge accepted");
		System.out.println(s);
	}
			public ClassC(int temp)
			{
				System.out.println("saturday");
				new ClassC(10,20);
				System.out.println("monday");
			}
			
			
			String display (java.lang.String string)
			{
				System.out.println("in the next statement i am returiry string value");
				return s;
			}
			public ClassC(int data,int temp)
			{
				System.out.println("thursday");
			}
	
	public static void main(String[] args) {
		
		{
			ClassC obj=new  ClassC ();
			System.out.println("out put verify");
		}
	}

}
