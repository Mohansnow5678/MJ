package dtopack;

public class UserDTO 
{
	private String uname,upass;
	private int flag;
	public String getuname() {
		return uname;
	}
	public void setuname(String uname) {
		this.uname = uname;
	}
	public String getupass() {
		return upass;
	}
	public void setupass(String upass) {
		this.upass = upass;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
}