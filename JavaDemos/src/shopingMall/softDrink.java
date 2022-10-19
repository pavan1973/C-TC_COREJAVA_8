package shopingMall;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class softDrink {
	public void softDrink() {
		List softDrink =  new ArrayList();
		softDrink.add("FANTA");
		softDrink.add("COCOCOLA");
		softDrink.add("THUMBSUP");
		softDrink.add("PEPSE");
		softDrink.add("MAZA");
		
		Iterator i1 = softDrink.iterator();
		while(i1.hasNext())
		{
		 System.out.println(i1.next());
		}

	}
	
	

}
