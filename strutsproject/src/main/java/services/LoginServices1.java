package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbpack.DBConnection;
import dtopack.UserDTO;

public class LoginServices1 extends ServiceRequest {
	
public LoginServices1() {
		
	}
	
	private UserDTO user;
	
	private DBConnection con;

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public DBConnection getCon() {
		return con;
	}

	public void setCon(DBConnection con) {
		this.con = con;
	}
	@Override
	public String executeService(HttpServletRequest request, HttpServletResponse response) {
		user=new UserDTO();
		
		con=new DBConnection();
		
		user.setuname(request.getParameter("uname"));
		
		user.setupass(request.getParameter("upass"));
		
		boolean a=con.checkUser(user.getuname(), user.getupass());
		
		if(a) {
			
			boolean b=con.checkFlag(user.getuname());
			
			if(b) {
				
				con.updateFlag(user.getuname(), 1);
				
				request.getSession().setAttribute("uname", user.getuname());
				
				return "Welcome-Page";
				
			}else {
				
				return "Already-Login";
				
			}
			
		}else {
		
		return "Invalid-User";
		
		}
		
	}
	
}


