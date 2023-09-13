package JDBC_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student_data {
	//Update query is used for inserting and updating values
	
	
	public void createDb(String name)
	{
		

		try
		{
			//While inserting data into table write the name of the database also
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "saad17@#..";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			//Statement creation
			Statement stm = conn.createStatement();
			
			
			//Execute-query
			String query = "use mydb";
			String query1 = "create table "+name+"detail(id int, name varchar(30), address"
					+ " varchar(40), age int)";
			stm.execute(query);
			stm.execute(query1);
			
			//connection close
			conn.close();
			
			
			System.out.println("Database table Created Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public void inserttb(int id, String name, String address, int age) {
		// TODO Auto-generated method stub
		
			try{
			
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "saad17@#..";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			//Statement creation
			Statement stm = conn.createStatement();
			//PreparedStatement pstm = conn.prepareStatement(query);
			//prepareStatement(query);
			//pstm.setInt(1,10);
			//pstm.setString(2,name);
			//pstm.setString(3,address);
			//pstm.execute(); or pstm.executeUpdate();
			
			//Execute-query
			String query = "use mydb";
			String query1 = "insert into "+name+"detail(id , name, address, age)"
					+ " values ("+id+", '"+name+"', '"+address+"', "+age+")";
			//stm.executeQuery(query); will not work because it returns us a result set 
			stm.execute(query);
			stm.execute(query1);
			
			//connection close
			conn.close();
			
			
			System.out.println("Table values inserted Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public void readData() {
		
		try{
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String userName = "root";
			String password = "saad17@#..";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			//Statement creation
			Statement stm = conn.createStatement();
			
			//Execute-query
			String query = "select * from saaddetail";
			
			ResultSet rs = stm.executeQuery(query);
			while(rs.next())
			{
				System.out.println(" id = "+rs.getInt(1));
				System.out.println(" name = "+rs.getString(2));
				System.out.println(" address = "+rs.getString(3));
				System.out.println(" age = "+rs.getInt(4));
			}
			
			//connection close
			conn.close();
			
			
			System.out.println("Read Data Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}
	
	public void updateData(String name)
	{
		try{
			
		String url = "jdbc:mysql://localhost:3306/mydb";
		String userName = "root";
		String password = "saad17@#..";
		
		Connection conn = DriverManager.getConnection(url, userName, password);
		
		String query1 = "update "+name+"detail set id = ? where name = ?";
				
		//Statement creation
		PreparedStatement pstm = conn.prepareStatement(query1);
		
		//Execute-query
		pstm.setInt(1,5);
		pstm.setString(2, name);
		//pstm.setString(2,name);
		//pstm.setString(3,address);
		pstm.executeUpdate();
		
		
		
		
		//connection close
		conn.close();
		
		
		System.out.println("Table values Updated Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void delData(int id)
	{
		try{
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String userName = "root";
			String password = "saad17@#..";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			String query1 = "delete from saaddetail where id = ?";
					
			//Statement creation
			PreparedStatement pstm = conn.prepareStatement(query1);
			
			//Execute-query
			pstm.setInt(1,id);
			//pstm.setString(2, "SAAD");
			//pstm.setString(2,name);
			//pstm.setString(3,address);
			pstm.executeUpdate();
			
			
			
			
			//connection close
			conn.close();
			
			
			System.out.println("Table values Deleted Successfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
