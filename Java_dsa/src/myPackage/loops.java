package myPackage;
import java.util.Scanner;

public class loops {
	public static void main(String args[])
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the number to find factors: ");
		int sal = obj1.nextInt();
		
		/*
		if(sal > 10000) {
			sal += 2000;
		}
		else if(sal > 20000){
			sal += 3000;
		}
		else{
			sal += 1000;
		}
		for(initialization, test-condition, update statement)
		{
		 	body
		}
		*/
		//find factors of number.
		System.out.printf("The factors of %d:",sal);
		for(int i=1; i<= sal; ++i)
		{
			for(int j=1; j<= sal; ++j)
			{
				if(i*j == sal)
				{
					System.out.print(i+" ");
				}
			}
		}
	}

}
