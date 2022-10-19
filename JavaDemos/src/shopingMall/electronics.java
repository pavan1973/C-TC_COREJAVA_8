package shopingMall;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class electronics {
	public void electronics() {
		List electronics =  new ArrayList();
		electronics.add("MOBILE");
		electronics.add("LAPTOP");
		electronics.add("GAMING PC");
		electronics.add("MAC BOOK");
		electronics.add("I PHONE");
		
		Iterator i1 = electronics.iterator();
		while(i1.hasNext())
		{
		 System.out.println(i1.next());
		}

}
	}
