package june;

public class Generics {

	public static void main(String[] args) {

		GoodpaintBrusherver3<Water> M = new GoodpaintBrusherver3<>();
		Water water=new Water();
	//	Air dryair=new Air();
		
		M.setObj(water);
	//		M.setObj(dryair);
			
			water=(Water)M.getObj();
		//	dryair=(Air)M.getObj();
			
			water.sprinkle();
	//		dryair.dusting();
	}

}

class Water {
	public void sprinkle() {
		System.out.println("water is sprinkled..");
	}
}

class Air {
	public void dusting() {
		System.out.println("dusting............");
	}
}

class GoodpaintBrusherver3<Sticker> {
	private Sticker obj;

	public void setObj(Sticker obj) {

		this.obj = obj;

	}

	public Sticker getObj() {
		return this.obj;
	}

}