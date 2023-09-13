package Java_Practice;

public class Product {
	
	//Whatever we write in class is in actual the property of object as we 
	//are describing the object 
	//If you want anything which should belong to class make it static !!
	
	//Attriubutes (State)
	int p_id;
	String name;
	int price;
	
	//constructor
	Product()
	{
		System.out.println("This is the constructor");
	}
	
	//Methods (Behaviour)
	//To write data in Product Object we have this method 
	void setProductDetails(int pid, String name, int price)
	{
		this.p_id = pid;
		this.name = name;
		this.price = price;
		
	}
	
	void showProductDetails() {
		
		System.out.println("------Product ID: "+p_id+"-----");
		
		System.out.println("Name: \t"+name);
		System.out.println("Price: \t"+price);
		
		System.out.println("-----------------------------------------");
		
	}

}


class Check_inheritance
{
	//main is executed by JVM when my program will run
	public static void main(String args[])
	{
		//Create an object : Product 
		Product product1 = new Product();
		
		//product1 is not an object, its a reference variable which holds the 
		//hashcode of the object in hexadecimal notation
		System.out.println("Product is:"+product1);
		product1.setProductDetails(77,"Mobile", 25000);
		product1.showProductDetails();
		
	}
}

// Servlets are Java-based codes. JSP are HTML-based codes




