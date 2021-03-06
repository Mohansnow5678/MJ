package services;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingService extends ServiceRequest {@Override
public String executeService(HttpServletRequest request, HttpServletResponse response) {
	Enumeration em=request.getParameterNames();
	
	HttpSession hs=request.getSession();
	
	
	String  nextshop=request.getParameter("shop");
	
	while(em.hasMoreElements()) {
		
		String a=em.nextElement().toString();
		
		String b=request.getParameter(a);
		
		hs.setAttribute(a,b);
		
	}
	
	return nextshop;
	
}

}
