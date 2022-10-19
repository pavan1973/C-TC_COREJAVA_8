package shopingMall;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class food {
	public void food() {
		List food =  new ArrayList();
		food.add("MASAL DOSE");
		food.add("IDLI VADE SAMBAR");
		food.add("CHAPATE");
		food.add("KARA BATH");
		food.add("BISI BELE BATH");
		
		Iterator i1 = food.iterator();
		while(i1.hasNext())
		{
		 System.out.println(i1.next());
		}

}
	

}
