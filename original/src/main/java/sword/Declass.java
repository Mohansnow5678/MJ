package sword;

import sample.Sameclass;

public class Declass {

	
		public void met() {
			Sameclass obj=new Sameclass();
			System.out.println(obj.pri);
			System.out.println(obj.nomod);
			System.out.println(obj.pro);
			System.out.println(obj.pub);
	}

}


class DifPackSub extends Sameclass{
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}