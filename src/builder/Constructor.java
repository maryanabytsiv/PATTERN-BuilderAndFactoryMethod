package builder;

public class Constructor {
	
	private CarBuilder carBuilder;
	
	public void setBuilder(CarBuilder builder){
		this.carBuilder = builder;
	}
	
	public Car getCar(){
		return carBuilder.getCar();
	}
	
	public void constructCar(String name){
		
		carBuilder.createCar(name);
		carBuilder.setConditioner();
		carBuilder.setHighlights();
		carBuilder.setMagnitola();
	}

}
