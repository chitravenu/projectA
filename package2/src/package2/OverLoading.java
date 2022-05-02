package package2;

public class OverLoading {


    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Sample
{
   public static void main(String args[])
   {
       OverLoading obj = new OverLoading();
       obj.disp('a');
       obj.disp('a',10);
   }
}
	
