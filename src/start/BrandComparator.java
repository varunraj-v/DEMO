package start;

import java.util.Comparator;

public class BrandComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle v1, Vehicle v2) {
		 return v1.getBrand().compareTo(v2.getBrand());				
		
		}
		
		
		
		
		
		
	

}
