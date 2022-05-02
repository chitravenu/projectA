package package2;

public class ClassA8
{
      static int a=0;
      int b=0;
      ClassA8()
      {
    	  a++;
    	  b++;
    	  System.out.println(" static variable=====>"+a);
    	  System.out.println("instance variable====."+b);
    	  System.out.println("=====");
      }
      void display()
      {
    	  System.out.println("*****accessing static variable**");
    	  System.out.println(ClassA8.a);
    	  System.out.println(a);
    	  System.out.println(new ClassA8().a);
      }
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		new ClassA8();
		new ClassA8();
		new ClassA8();
		System.out.println("###########");
		new ClassA8().display();

	}

}
