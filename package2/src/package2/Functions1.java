package package2;

public class Functions1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Functions1 obj=new Functions1();
	double total=obj.add(10,20);// function calling
	System.out.println("Sum of two numbers are " +total);
	total=obj.add(50,80.30);
	System.out.println("Sum of two numbers are " +total);
	}
	//this function is used to add two numbers and return result
	double add(int x, double y)
	{
		double sum=x+y;
		return(sum);
		
		
	}
	

}


