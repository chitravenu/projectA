package package2;

public class Student {
	int rolno;
	String name;
	String group;
	static String collegeName;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student();
		Student.initStaticData();
		std1.init(1,"venu","cec");
		std1.display();
		Student st2=new Student();
		st2.init(2, "Rahul", "Bpc");
		st2.display();
		
	}
		static void initStaticData()
		{
			collegeName="SSVM";
		}
		void init(int rolno_temp,String name_temp,String group_temp)
		{
			rolno=rolno_temp;
			name=name_temp;
			group=group_temp;
		}
		static
		{
			System.out.println("Static block code");
		}
		void display()
		{
			System.out.println("Name = " +name);
			System.out.println("Rolno = " +rolno);
			System.out.println("Group = " +group);
			System.out.println("College = " +collegeName);
		}

}
