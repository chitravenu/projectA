package package2;

public class Cba {
   private static Cba aobj;
int i;
   byte b;
   short s;
   long l;
   float f;
   double d;
   char c;
   boolean flag;
   void meth1()
   {
	   System.out.println("printing the deafault values of the 8PDT");
	   System.out.println("int value;+i");
	   System.out.println("byte value;"+b);
	   System.out.println("long value "+l);
	   System.out.println("float value"+f);
	   System.out.println("double value"+d);
	   System.out.println("char value"+c);
	   System.out.println("boolean value"+flag);
   }
		   void meth2()
		   {
		   
		    byte b1=10;
		    byte b2=10;
		    byte b3=(byte)(b1+b2);//type casting
		    //in java every number is by default considered as int by the compiler
		    //in java every decimal value is considered as double by the compiler
		    float f=10.9f;
		    long x=2147483648l;
		    System.out.println("b3;+b3");
		    System.out.println("f;"+f);
		    System.out.println("x;"+x);
		   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Cba  aobj=new Cba ();
		 aobj.meth1();
		 System.out.println("==========");
		 aobj.meth2();
	}

}
