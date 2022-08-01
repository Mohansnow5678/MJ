package com.example.demo;

import java.net.http.HttpRequest;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/moon")

public class KServlet {

	public KService getHeartless() {
		return heartless;
	}

	public void setHeartless(KService heartless) {
		this.heartless = heartless;
	}

	@Autowired
	private KService heartless;

	@RequestMapping(method = RequestMethod.GET, value = "/green")
	public ModelAndView kfclogin1() {
		ModelAndView op = new ModelAndView();
		op.setViewName("login");
		return op;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/green")
	public ModelAndView kfclogin(HttpServletRequest request) {

		ModelAndView op = new ModelAndView();

	String kname=request.getParameter("kname");
	String kpassword=request.getParameter("kpassword");
	
	List<Kfc> kit=heartless.checkuser(kname, kpassword);	
     Iterator<Kfc> tik=kit.iterator();
    while(tik.hasNext()) {
    	op.setViewName("welcome");
		return op;
           	
    }
	op.setViewName("error");
		return op;
}

	@RequestMapping(method = RequestMethod.GET, value = "/green3")
	public ModelAndView reg() {
		ModelAndView op = new ModelAndView();
		Kfc chuk=new Kfc();
		chuk.setKflag(0);
		op.addObject("user",chuk);
		op.setViewName("register");
		return op;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/green3")
	public ModelAndView reg1(@ModelAttribute("user") Kfc muruga,HttpServletRequest request) {
		ModelAndView op = new ModelAndView();
		String pass1=request.getParameter("pass1");
		String pass2=request.getParameter("pass2");
		if(pass1.equals(pass2)) {

			List<Kfc> ela=heartless.checkkid(muruga);
			Iterator<Kfc> shiva=ela.iterator();
			int f=0;
			while(shiva.hasNext()) {
				f=shiva.next().getKid();
			}
			int g=f+1;
			muruga.setKpassword(pass2);
			muruga.setKid(g);
			op.addObject("user", muruga);
			heartless.savetree(muruga);
			
			op.setViewName("welcome");
			return op;
		}
		op.setViewName("error");
		return op;
	}

}
