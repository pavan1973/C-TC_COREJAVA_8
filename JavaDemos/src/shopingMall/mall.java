package shopingMall;



public class mall {

	public static void main(String[] args) {
		food obj = new food();//creating a object from food class
		System.out.println("*********************************");
		System.out.println("\nfood in shoping mall:-\n");
		
		obj.food();//calling a object
	
		System.out.println("*********************************");
		electronics obj1 = new electronics();	
		System.out.println("\nelectronics in shoping mall:-\n");
		obj1.electronics();
		System.out.println("*********************************");
		softDrink obj2 = new softDrink();
		System.out.println("\nsoftDrink in shoping mall:-\n");
		obj2.softDrink();
		System.out.println("*********************************");
	}
	


}
