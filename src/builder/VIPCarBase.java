package builder;

public class VIPCarBase extends CarBuilder{
	
	@Override
	void setHighlights() {
		car.setHighlights("Strong highlights");
	}
	
	@Override
	void setConditioner() {
		car.setConditioner("VIP cond");
	}

	@Override
	void setMagnitola() {
		car.setMagnitola(true);
		
	}

}
