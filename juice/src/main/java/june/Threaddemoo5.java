package june;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Threaddemoo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es=Executors.newFixedThreadPool(2);
		Theatre iMax=new Theatre();
		Theatre iMax2=new Theatre();
		
		es.execute(
				()->{
					synchronized(Theatre.class) {
					//synchronized(iMax) {
					Thread.currentThread().setName("rajini");
					//Theatre.toilet.useToilet();
					iMax.toilet.useToilet();
					}
				}
		);
		
		es.execute(
				()->{
					synchronized(Theatre.class) {
					//synchronized(iMax2) {
					Thread.currentThread().setName("kamal");
					//Theatre.toilet.useToilet();
					iMax2.toilet.useToilet();
					}
				}
		);
		es.shutdown();
	}

	}


class Toile{
	public void useToilet() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the toilet...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" came out of toilet...");
	}
}
class Theatr{
	 Toile toilet=new Toile();
}









