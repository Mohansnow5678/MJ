package june;

import java.lang.reflect.Field;

import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {

		Politician diamond = new Politician();
		Policestation p1 = new Policestation();

		p1.arrest(diamond);

	}

}

class Policestation {

	public void arrest(Object obj) throws Exception {
		Politician pol = (Politician) obj;
		Class c = obj.getClass();
		Field f = c.getField("name");
		System.out.println(f.get(obj));

		Method m = c.getMethod("service");
		m.invoke(obj);
		singamIntrogation(obj);

	}

	public void singamIntrogation(Object obj) throws Exception {
		Class c = obj.getClass();
		Field f = c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(obj));

		Method m = c.getDeclaredMethod("secretService");
		m.setAccessible(true);
		m.invoke(obj);

	}
}

class Politician {
	public String name = "I am a good man...";
	private String secretName = "I am a gunda,...thief...";

	public void service() {
		System.out.println("I do social service.....");
	}

	private void secretService() {
		System.out.println("I do loot people...........");
	}
}