package assignment;

public class switchCaseInJava_int {

	public static void main(String[] args) {
	int a = 4;
	/*if(a==1)
	{System.out.println("the value of a is 1");}
	else if(a==2)
	{System.out.println("the value of a is 2");}
	else if(a==3)
	{System.out.println("the value of a is 3");}
	else
	{System.out.println("the value is other than 1,2,3");} */
	
	switch(a) {
	case 1:
		System.out.println("the value of a is 1");
		break;
	case 2:
		System.out.println("the value of a is 2");
		break;
	case 3:
		System.out.println("the value of a is 3");
		break;
	default:
		System.out.println("the value of a is other than 1,2,3");
		break;
	}

	}

}
