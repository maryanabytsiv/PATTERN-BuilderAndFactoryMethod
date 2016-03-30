package builder;

public class Car {

	private String name;
	private String conditioner;
	private String highlights;
	private boolean Magnitola;

	public Car(String name) {
		this.name = name;
	}


	public String getConditioner() {
		return conditioner;
	}

	public void setConditioner(String conditioner) {
		this.conditioner = conditioner;
	}

	public String gethighlights() {
		return this.highlights;
	}

	public void setHighlights(String highlights) {
		this.highlights = highlights;
	}

	public boolean isMagnitola() {
		return Magnitola;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", conditioner:" + conditioner + ", CoolHighlights:" + highlights
				+ ", Magnitola=" + Magnitola + "]";
	}

	public void setMagnitola(boolean magnitola) {
		Magnitola = magnitola;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
