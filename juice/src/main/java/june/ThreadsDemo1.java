package june;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsDemo1 {

	public static void main(String[] args) {
		System.out.println("Soup");
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() -> {met();});

		es.shutdown();

		System.out.println("STARTER");

	}

	public static void met() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		System.out.println("Main Item");
	}
}
