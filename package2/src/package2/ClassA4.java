package package2;



public class ClassA4 {

		private static Object aobj2;
		private static ClassA4 aobj;

		void meth1()
		{
			System.out.println("class B method called");
		}
		protected void finalize()
		{
			System.out.println("Garbage has been collected");
		}

		public static void main(String[] args)
	{
	          ClassA4 aobj1=new ClassA4(); 
	          ClassA4 aobj2=new ClassA4();
	          //hashcode()//
	          System.out.println("aobj1 hashcode:"+aobj1.hashCode());
	          System.out.println("aobj2 hashcode:"+aobj2.hashCode());
	          System.out.println();
	          //equals//
	          System.out.println(aobj1.equals(aobj1));//true
	         System.out.println(aobj1.equals(aobj2)); //false
	         System.out.println();
	         //toString()//
	         System.out.println("to string():"+aobj1.toString());
	         System.out.println("to String():"+aobj2.toString());
	         System.out.println();
	         //getClass//
	         System.out.println("get class():"+aobj1.getClass());
	         System.out.println("get class():"+aobj2.getClass());
	         System.out.println();
	         //finalize//
	         aobj.meth1();
	         aobj1=null;
	         System.gc();//it is the way to call the garbage collector//
	         //aobj1.meth1();//NUllpointerEXception
	         
		}

	}
