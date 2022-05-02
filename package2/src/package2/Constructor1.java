package package2;

public class Constructor1 
{
  String name;
  int id;
  int salary ;
  
  public static void main(String[] args) {
   Constructor1 std1=new Constructor1 ("venu",001,50000);
       std1.display();
    
       Constructor1 obj=new Constructor1();
    
	}
		// TODO Auto-generated method stub
		
	Constructor1(String name,int id,  int i)
	{
	
	
		name=name;
		id=id;
		salary=i;
		
	}
	{
		System.out.println("execute all the ststements");
	}
	
	public Constructor1() {
		// TODO Auto-generated constructor stub
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("salary:"+salary);
	
	
	}

}
		