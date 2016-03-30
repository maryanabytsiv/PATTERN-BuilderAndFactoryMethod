package builder;

public class EcomomCarBase extends CarBuilder{
	

	@Override
	void setHighlights() {
		car.setHighlights("Standart Highlights");
	}
	
	@Override
	void setConditioner() {
		car.setConditioner("No conditioner");
	}
	
	@Override
	void setMagnitola() {
		car.setMagnitola(true);
		
	}

}
