import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dota {

	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/pubg?useSSL=false","root","");
			
			String sql="select * from players";
			
             PreparedStatement stmt=con.prepareStatement(sql);
			
			
			ResultSet as= stmt.executeQuery();
			
			while(as.next())
			{
				System.out.println(as.getString("playername"));
			}
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
