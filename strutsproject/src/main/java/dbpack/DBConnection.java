package dbpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dtopack.UserDTO;


public class DBConnection {
	public DBConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public Boolean checkUser(String uname,String upass)
	{
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bird", "root", "beetroot");
			String query="select *from users where uname=? and upass=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, upass);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	public Boolean checkFlag(String uname )
	{
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bird", "root", "beetroot");
			String query="select flag from users where uname=? ";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, uname);
			ResultSet rs=ps.executeQuery();
			
			
			
			if(rs.next())
			{
				int flag=rs.getInt(1);
				if(flag==0)
				{
				return true;
				}
				else
				{
				return false;
				}
			}
			else
			{
				return false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	

	
public Boolean updateFlag(String uname, int flag) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bird","root","beetroot");
			
			String query="Update users set flag=? where uname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, flag);
			
			ps.setString(2, uname);
			
			int i=ps.executeUpdate();
			if(i!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
			
			
		}
		
	}
public Boolean registerUser(UserDTO user)

{
	try
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bird", "root", "beetroot");
		String query="insert into users values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, user.getuname());
		ps.setString(2, user.getupass());
		ps.setInt(3,user.getFlag());
		int i=ps.executeUpdate() ;
		
		if(i>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
		return false;
	}
	
}


	public static void main(String[] args) {
		DBConnection conn=new DBConnection();
		
		System.out.println(conn.checkUser("rik","secret"));
		System.out.println(conn.updateFlag("rik", 1));
		System.out.println(conn.checkFlag("veedha"));
		
	}

}
