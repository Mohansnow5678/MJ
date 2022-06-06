package chap5;

public class Singleton {

	public static void main(String[] args) {
		DBconnection.getDBCon();
		DBconnection.getDBCon();
		DBconnection.getDBCon();
		
		
	}}

class DBconnection{
	
	
	private DBconnection() {
		
		System.out.println("Hii Daah");
	}
	
	
	private static DBconnection dbcon;
	
	public static DBconnection getDBCon() {
		
		if(dbcon==null) {
			
			dbcon=new DBconnection();
			return dbcon;
			
		}
		else {
			return dbcon;
		}
	
	}
	
	
}