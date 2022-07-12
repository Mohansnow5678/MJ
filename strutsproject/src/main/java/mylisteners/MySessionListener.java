package mylisteners;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import dbpack.DBConnection;
@WebListener
public class MySessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se)  {
        System.out.println("session created .........");
    }
    public void sessionDestroyed(HttpSessionEvent se)  {
    	System.out.println("session destroyed........");
    	
    	DBConnection dbcon=new DBConnection();
    	HttpSession session=se.getSession();
    	Object obj=session.getAttribute("uname");
    	if(obj!=null) {
    		String uname=obj.toString();
    		dbcon.updateFlag(uname, 0);
    	}
    	
    }
	
}