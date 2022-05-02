package package2;

public class ClassAB2
{
    void meth1()
    {
    	ClassAB2 aobj=new ClassAB2();
    	System.out.println("implementing switch case");
    	int a=65;
    	byte b=30;
    	final int z=10;
    	switch (b+10-5)
    	{
    	//system .out .println("individual statements are not allowed in switch");//C.E
    	default:
    	System.out.println("no case lables matched with the key");
    	//z++;//final variables are constants we can't change the value
    	break;
    	case z:
    		System.out.println("case 10 executed");
    		System.out.println("from case 1o:"+aobj.meth2());
    		break;
    	case 'A':
    	System.out.println("vase 20 executed");
    	System.out.println("case label datatype and key datatypes should be compatible");
    	System.out.println("from case 20:"+aobj.meth2());
    	break;
    	case 300-265:
    	System.out.println("case 30 executed");
    	System.out.println("from case 35:"+aobj.meth2());
    	break;
    	case 40:
    		System.out.println("case 40 executed");
    		System.out.println("from case 40:"+aobj.meth2());
    		break;
    	case 50:
    		System.out.println("case 50 executed");
    		System.out.println("from case 50:"+aobj.meth2());
    		break;
    	}
    	System.out.println("compiler came out from switch");
    }
    java.lang.String meth2()
    {
    	return"java is awesome";
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new ClassAB2().meth1();
	}

}
