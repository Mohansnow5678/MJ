package june;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread6 {

	public static void main(String[] args) {
	
		CouncellingHall Bro=new CouncellingHall();
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(()->{
		Thread.currentThread().setName("KAMAL");
		
		Bro.showpapers();
		Bro.Selectingcollege();
		Bro.payfees();
		Bro.exit();
		
		});
		es.execute(()->{
			Thread.currentThread().setName("Hari");
			
			Bro.showpapers();
			Bro.Selectingcollege();
			Bro.payfees();
			Bro.exit();
			
			});
		es.execute(()->{
			Thread.currentThread().setName("Rajini");
			
			Bro.showpapers();
			Bro.Selectingcollege();
			Bro.payfees();
			Bro.exit();
			
			});
		es.shutdown();
	}
}


class CouncellingHall{
	synchronized  public void showpapers() {
		  Thread t=Thread.currentThread();
	      String name=t.getName();
	      System.out.println(name+"  showing papers");
	      try {Thread.sleep(3000);}catch(Exception e) {}
	      System.out.println(name+"  completed showing papers");
	  }
	
	synchronized	public void Selectingcollege() {
		Thread t=Thread.currentThread();
		 String name=t.getName();
		 System.out.println(name+" Selecting college");
	      try {Thread.sleep(3000);}catch(Exception e) {}
	      System.out.println(name+"  completed sSelecting colleges");
	}
	synchronized	public void payfees() {
		Thread t=Thread.currentThread();
		 String name=t.getName();
		 System.out.println(name+"  paying fees");
	      try {Thread.sleep(3000);}catch(Exception e) {}
	      System.out.println(name+"  payed fees");
	}
	
	synchronized		public void exit() {
		Thread t=Thread.currentThread();
		 String name=t.getName();
System.out.println(name+"  exit");
		
	}
	  
	  
	  

}