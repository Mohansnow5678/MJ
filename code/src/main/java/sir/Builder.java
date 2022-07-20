package sir;

public class Builder {

	public static void main(String[] args) {
		Compute tr = new Compute.computerbuilder("500 GB", "2GB").setBluetoothEnabled(true).SetgraphicsCardEnabled(true)
				.build();

		System.out.println(tr.getRAM() + "   " + tr.getHDD());
	}

}

class Compute {
	// instance variable
	private String HDD;
	private String RAM;
	private boolean isgraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isgraphicsCardEnabled() {
		return isBluetoothEnabled;

	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private Compute(computerbuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;

		this.isgraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;

	}

	// BUILDER CLASS

	public static class computerbuilder {
		private String HDD;
		private String RAM;

		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public computerbuilder(String hdd, String ram) {

			this.HDD = hdd;
			this.RAM = ram;

		}

		public computerbuilder SetgraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;

		}

		public computerbuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;

			return this;

		}

		public Compute build() {
			return new Compute(this);

		}

	}
}
