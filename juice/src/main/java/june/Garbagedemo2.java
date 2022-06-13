package june;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import org.apache.commons.lang.math.RandomUtils;

public class Garbagedemo2 {

	public static void main(String[] args) {
	
		Runtime R=Runtime.getRuntime();
		
		System.out.println("Available Memory"+R.maxMemory());
		
		System.out.println("Available Memory"+R.availableProcessors());
		
		System.out.println("Free Memory"+R.freeMemory());
		R.gc();
		
		Food food=new Food();
		System.out.println("Free memory"+R.freeMemory());
		
		
		SoftReference soft=new SoftReference(food);
	//	WeakReference weak=new WeakReference(food);
		
		food=null;
		
		
		
		R.gc();
		System.out.println("Free Memory..:"+R.freeMemory());
		food=(Food)soft.get();
	//	food=(Food)weak.get();
		System.out.println(food);
		
		
		
		
		}

}

class Food {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize for the food object is called");
	}

}