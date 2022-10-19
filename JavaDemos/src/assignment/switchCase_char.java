package assignment;

public class switchCase_char {

	public static void main(String[] args) {
		char x = 'a';
		switch (x)
		{
		case 'p':
		case 'P':
			System.out.println("the char of x is P or p");
			break;
		case 'a':
		case 'A':
			System.out.println("the char of x is A or a");
			break;
		case 'z':
		case 'Z':
			System.out.println("the char of x is z or Z");
		break;
		default:
			System.out.println("the char of x is other than a z p");
			break;
		}
		

	}

}
