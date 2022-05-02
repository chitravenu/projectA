package package1;

public class ClassB 
{
      public void meth1()
	 {
		 int a=20000;
		 int b=50000;
		int sum=a+b;
		 System.out.println("meth1 calling:"+sum);
	 }
      
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ClassB aobj=new ClassB();
               aobj.meth1();
	 
		}

}
