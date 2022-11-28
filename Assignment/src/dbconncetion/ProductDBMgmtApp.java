package dbconncetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDBMgmtApp {
int pid;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pid;
		Scanner sc=new Scanner(System.in);
		System.out.println("******************************");
		System.out.println("Product Management Application");
		System.out.println("******************************");
		System.out.println("Enter Product Details");
		System.out.println("1.Add Product Details");
		System.out.println("2.Update Product Price");
		System.out.println("3.View Product Details");
		System.out.println("4.Delete Product");
		System.out.println("5.View Product Name and Price");
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Pune@2022");
			if(con!=null)
			{
				System.out.println("Database Has Sucessfully Connected");
			}
			else
			{
				System.err.println("Database HAs not Been Connected");
			}
			switch(choice)
			{
			case 1: System.out.println("Enter a Product ID");
					 pid=sc.nextInt();
					System.out.println("Enter Product Name");
					String pname=sc.next();
					System.out.println("Enter Product Price ");
					int pprice=sc.nextInt();
					PreparedStatement pr=con.prepareStatement("insert into productapp values(?:?:?)");
					pr.setInt(1, pid);
					pr.setString(2, pname);
					pr.setDouble(3, pprice);
					int count=pr.executeUpdate();
					if(count>0)
					{
						System.out.println("Record Inserted Sucessfully");
					}
					break;
			case 2: System.out.println("Enter a Product ID");
					 pid=sc.nextInt();
					System.out.println("Enter a Product New Price");
					int new_price=sc.nextInt();
					PreparedStatement pr1=con.prepareStatement("update productapp set price=? where pid=?");
					pr1.setInt(1, new_price);
					pr1.setInt(2, pid);
					int update=pr1.executeUpdate();
					if(update>0)
					{
						System.out.println("Record Has been Sucessfully Updated");
					}
					break;
			default: System.out.println("Invalid Option");
					
					
			
			}
		}catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
			
		
	}

}
}
