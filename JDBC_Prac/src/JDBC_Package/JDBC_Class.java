package JDBC_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Class {
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter your roll number: ");
		int rno = obj.nextInt();
		//Driver load (not needed now)
		
		//Connection establish, conn
		try
		{
			//jdbc = driver; mysql = server(where database is);
			//localhost = our local database; mydb = database name;
			//For check the database connection you can skip its name
			//Add external jar file before you directly try to connect
			//Add connector(jar file)
			//Otherwise no driver will be found and error will come
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "saad17@#..";
			
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//You can connect database without port in offline database, while in online
			//it is necessary that you write port number.
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			//Statement creation
			Statement stm = conn.createStatement();
			
			//Execute-query
			String query = "use mydb";
			String query1 = "insert into student(rollNo, name) values("+rno+", '"+name+"')";
			stm.execute(query);
			stm.execute(query1);
			
			//connection close
			conn.close();
			
			//String query = "create database loginDB";
			//boolean bl = stm.execute(query);
			//It will return false even when database is created because this method 
			//is not returning anything
			
			System.out.println("Database values Inserted Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		obj.close();
	}

}
