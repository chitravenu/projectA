package package1;

public class Constructor
{
   String name;
   int id;
   String job;
   int salary;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Constructor std1=new Constructor("venu",001,"police",100000);
         std1.display();
        
		Constructor std2=new Constructor("vishal",002,"army",200000);
         std2.display();
        
		Constructor std3=new Constructor("madhav",003,"software",300000);
         std3.display();
         
		Constructor aobj=new Constructor();
	}
  Constructor(String name,int id,String job,int salary)
  {
	 this. name=name;
	 this. id=id;
	 this. job=job;
	 this. salary=salary;
  }


  public Constructor() {
	// TODO Auto-generated constructor stub
}
void display()
  {
	  System.out.println("name:"+name);
			System.out.println("id:"+id);  
			System.out.println("job:"+job);
			System.out.println("salary:"+salary);
  }
}
