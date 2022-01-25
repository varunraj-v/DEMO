package start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sample  {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>(Arrays.asList(15,25,16,26));
		 Collections.sort(li);
		 for(Integer l :li) {
			System.out.println(l);
		 }
	
		
		
	}
	

}
