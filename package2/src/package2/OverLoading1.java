package package2;

public class OverLoading1 {
	 public void disp(char c)
	    {
	        System.out.println(c);
	    }
	    public void disp(int d)
	    {
	       System.out.println(d );
	    }
	}

	class Sample2
	{
	    public static void main(String args[])
	    {
	        OverLoading1 obj = new OverLoading1();
	        obj.disp('a');
	        obj.disp(5);
	    }
	}

