package builder;

public abstract class CarBuilder {
	
	protected Car car;
	
	void createCar(String name){
		this.car = new Car(name);
	}
	
	Car getCar(){
		return car;
	}
	
	abstract void setConditioner();
	abstract void setHighlights();
	abstract void setMagnitola();

}
