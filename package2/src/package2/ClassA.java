package package2;

public class ClassA
{
     int a=10;//instance variable
     static int b=20;//static variable
     static int y;//static variable
     int x;//instance variable
     void meth1()
     {
    	 int a=30;//local variable
    	 int b=500;//local variable
    	 java.lang.String data="java is awesome";
    	// System.out.println("instance variable a;"+a);
    	 System.out.println("instance variable a;"+a);
    	 System.out.println("instance variable a;"+ new ClassA ().a);
    	 System.out.println("___________");
    	 //system.out.println("static variable b;"+b);
         System.out.println("static variable;"+ new ClassA().b);
    	 System.out.println("static variable b;"+ ClassA.b);
    	 System.out.println("------------");
    	 System.out.println("local variable c:"+a);
     }
    	 void meth2()
    	 {
    		 int z;
    		 System.out.println("------meth2()-----");
				System.out.println("x;"+x);//0
				System.out.println("y;"+y);
    			//System.out.println("z;"+z);//c.e
    			System.out.println("------------");
    			System.out.println("instance variable a;"+a);
    			System.out.println("static variable b;"+b);
    		//	System.out.println("local variable data;"+data);
    			//C.E because the scope of local variable is only upto that method
    	 }
    	 public static void main(String[] args) {
    			
    	 
    
    		 ClassA aobj = new ClassA();
    		 aobj.meth1();
    		 aobj.meth2();
    	 }
    			 
			
		}
    			
     
   /*
     1.if local variable name and instance variable name both are same the first primary will be given to the local variable
     
     2.if local variable name and static variable name both are same the first primary will be given to the local variable
     */