package package2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Collection values=new ArrayList();
        values.add("venu");
        values.add(1);
        values.add(55.33);
        Iterator i=values .iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        values.remove(55.33);
        for(Object i1:values)
        {
        	System.out.println(i1);
        }
        values.add(2);
        for (Object i1:values)
        {
        	System.out.println(i1);
        }

}

}