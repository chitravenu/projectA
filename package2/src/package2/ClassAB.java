package package2;

public class ClassAB {

	
		void examEligibility(int age)//21to37
		{
			if(!(age>=21 || age<35));//true===>false
			{
				System.out.println("person is eligible for exam");
			}
			
			{
				System.out.println("person is not eligible for exam");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new ClassAB().examEligibility(99);
	}

}
