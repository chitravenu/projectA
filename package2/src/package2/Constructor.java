package package2;

public class Constructor 
{
	String name;
	int rolno;
	String group;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor std1=new Constructor("venu",1,"cec");
		std1.display();
		Constructor std2=new Constructor("vishal",2,"police");
		std2.display();
		Constructor std3=new Constructor("pavan",3,"leader");
		std3.display();
		Constructor aobj=new Constructor();

	}
	Constructor(String name_temp,int rolno_temp,  String group_temp)
	{
		this.name=name_temp;
		this.rolno=rolno_temp;
		this.group=group_temp;

	{
		System.out.println("Default constrctor is executed");
	}
	
		}
	public Constructor() {
		// TODO Auto-generated constructor stub
	}
	void display()
	{
		System.out.println("Student name is " +name);
		System.out.println("Student rolno is " +rolno);
		System.out.println("Student group is " +group);
		System.out.println("all statement excuted");
	}
}

