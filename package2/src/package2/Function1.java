package package2;

public class Function1 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Function1 obj=new Function1();
     int total = obj.add(30,50);
     System.out.println("multification off"+total);
     int total1=obj.add(50,40);
     System.out.println("multification are"+total1);
	}

   int add(int x,int y)
   {  
   int multipication =x*y;
   return(multipication);
}

}