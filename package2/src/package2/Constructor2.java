package package2;

import package1.Constructor;

public class Constructor2
{
	String name;
	int rollno;
	String job;
	

	public Constructor2(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}
	public Constructor2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Constructor2 std1=new Constructor2("venu",1,"police");
 std1.display();
 Constructor2 obj=new Constructor2();
	}
  void Construction2(String name_temp,int rollno_temp,String job_tmp) 

  {
	  name=name_temp;
	  rollno=rollno_temp;
	  job=job_tmp;
  }
void display()
{
	System.out.println("name :"+name);
	System.out.println("rollno:"+rollno);
	System.out.println("job:"+job);
}
}