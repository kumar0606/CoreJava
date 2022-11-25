package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class batching {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement insert=null;
	PreparedStatement update=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/joins","root","Ravi@1999");
		insert=con.prepareStatement("insert into employee values (?,?,?)");
		update=con.prepareStatement("update employee set name=? where eid=?");
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("enter your id:");
			String id=sc.nextLine();
			System.out.println("enter your name:");
			String name=sc.nextLine();
			System.out.println("enter your salary");
			String salary=sc.nextLine();
			
			insert.setString(1, id);
			insert.setString(2, name);
			insert.setString(3, salary);
			insert.addBatch();
			
		System.out.println("insert more values (y/n)");
		String option=sc.nextLine();
		if(option.equalsIgnoreCase("n")) {
			break;
		}
		}
		
	 int [] a=insert.executeBatch();
	 System.out.println(Arrays.toString(a));
	 int  b=update.executeUpdate();
	 System.out.println(b);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
}
}
