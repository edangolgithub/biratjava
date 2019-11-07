import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Databaseconnection {

	public static void main(String[] args)
	{
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/birat?useSSL=false","root","");
			String sql="select * from students";
			
			PreparedStatement stmt=con.prepareStatement(sql);
			
			
			ResultSet rs= stmt.executeQuery();
			
			
			while(rs.next())
			{
				System.out.print("ID :" + rs.getInt("studentid"));;
				System.out.print("  NAME :" + rs.getString("studentname"));;
				System.out.print("  ROLL :" + rs.getString("roll"));;
				System.out.print("  GRADE :" + rs.getString("grade"));;
				System.out.println();
			}
			con.close();
			
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			//System.out.println("server unable to connect");
			e.printStackTrace();
		}

	}

}
