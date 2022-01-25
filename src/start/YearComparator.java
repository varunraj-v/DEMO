package start;

import java.util.Comparator;

public class YearComparator implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		if(o1.getYear()>o2.getYear()) {
			return +1;			
		}
		if(o1.getYear()<o2.getYear()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

}
