package builder;

public class Main {
	public static void main(String[] args) {
		EcomomCarBase economOpel = new EcomomCarBase();
		
		Constructor constructor1 = new Constructor();
		constructor1.setBuilder(economOpel);
		constructor1.constructCar("Opel econom");
		Car car = constructor1.getCar();
		System.out.println(car.toString());
		
		VIPCarBase vipOpel = new VIPCarBase();
		
		Constructor constructor2 = new Constructor();
		constructor2.setBuilder(vipOpel);
		constructor2.constructCar("Opel VIP");
		car = constructor2.getCar();
		car.setConditioner(ConditionerFactory.getConditionerCompanyByLevel(2));
		System.out.println(car.toString());
	}


}
