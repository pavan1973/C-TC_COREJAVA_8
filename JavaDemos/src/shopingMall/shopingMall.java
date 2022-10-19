package shopingMall;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class shopingMall {

	public static void main(String[] args) {
		List md =  new ArrayList();
		System.out.println("\n \n md:-");
		md.add("meg allu tikke");
		md.add("soft drinks");
		md.add("french fries");
		md.add("chicken burger");
		md.add("egg burger");
		
		Iterator i2 = md.iterator();
		while(i2.hasNext())
		{
		 System.out.println(i2.next());
		}

		
		List mm =  new ArrayList();
		System.out.println("\n \n mm:-");
		mm.add("coffe");
		mm.add("tee");
		mm.add("milk shake");
		mm.add("chicken burger");
		mm.add("egg burger");
		
		Iterator i1 = mm.iterator();
		while(i1.hasNext())
		{
		 System.out.println(i1.next());
		}

	}

}
