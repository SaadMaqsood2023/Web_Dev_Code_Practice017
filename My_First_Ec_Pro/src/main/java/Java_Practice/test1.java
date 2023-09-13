package Java_Practice;

import java.util.Scanner;
public class test1 {

	static int sum(int a, int b)
	{
		return a+b;
	}
	
	public static void main(String args[])
	{
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Enter the two numbers");
		System.out.println("Enter the first number");
		int n1 = obj1.nextInt();
		System.out.println("Enter the second number");
		int n2 = obj1.nextInt();
		
		System.out.println("The sum is: "+sum(n1,n2));
		
	}
	
}
