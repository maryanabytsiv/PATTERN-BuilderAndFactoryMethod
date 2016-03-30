package builder;

public class ConditionerFactory {
	
	static String getConditionerCompanyByLevel(int levelOfComfort){
		
		switch (levelOfComfort) {
		case 0:
			return "Base Conditioner AF45";
		case 1:
			return "Middle Conditioner GT47";
		case 2:
			return "Strong Conditioner GH+45";
		default:
			return "Base complectation YH78/";
		}
		
		
		
	}

}
