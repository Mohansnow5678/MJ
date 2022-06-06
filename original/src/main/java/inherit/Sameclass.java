package inherit;

public class Sameclass {
	public int pri;
	public int nomod;
public int pro;
	public int pub;
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}

class nonsub 
{
	
	public void met() {
		Sameclass obj=new Sameclass();
		System.out.println(obj.pri);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
		
}
}

class SamePackSub extends Sameclass{
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
