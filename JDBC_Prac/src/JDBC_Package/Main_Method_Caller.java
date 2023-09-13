package JDBC_Package;

public class Main_Method_Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student_data std1 = new Student_data();
		
		//std1.createDb("SAAD");
		
		//When inserting values in the database write the name of database in the 
		//connection creation
		//std1.inserttb(1,"SAAD","Malir Karachi",21);
		//std1.inserttb(2, "SAAD", "Malir Cant", 21);
		std1.delData(5);
		std1.readData();
		//std1.updateData("SAAD");
	}

}
