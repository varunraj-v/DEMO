package start;

import java.util.Comparator;

public class BrandComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}

	
		
		
		
		
		
		
	

}
