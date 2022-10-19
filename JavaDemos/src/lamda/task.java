package lamda;

import java.util.function.Predicate;

public class task {

	public static void main(String[] args) {
		int odd=0;
		int even=0;
		int arr[]={33,3,4,5};
	
		Predicate<Integer> predicate = num -> num%2==0;
		for (Integer i : arr) 
		{ 
		  //  System.out.println(i);
		    if(predicate.test(i))
		    {
		    	even++;
		    }
		    odd++;
		}
		
		    
		System.out.println(odd);
		System.out.println(even);

	}

}
