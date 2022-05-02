package package2;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions obj=new Functions();
		int total= obj.add(10,20);
		System.out.println("sum of two numbers are"+total);
		total=obj.add(60,50);
		System.out.println("sum of two numbers of"+total);
	}
	//this function is used to add two numbers and below is the definition of function
	int add(int x,int y)
	{
		int sum=x+y;
		return(sum);

	}

	
	}


