package start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exam {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<>(Arrays.asList("varun","a","PRABHU"));
		//Iterator<String> s = li.iterator();
//		for(String d : li) {
			
//			if(d.equals(d.toLowerCase()) ){
//				System.out.println("lowercase");
//			
//			}
//			else if(d.equals(d.toUpperCase())){
//				System.out.println("uppercase");
//			}
//			else {
//				System.out.println("mixedcase");
//			}
//			
	//	}
		Iterator<String> b=li.iterator();
		
		while(b.hasNext()) {
			String d = b.next();
			if(d.equals(d.toLowerCase())) {
				System.out.println("lowercase");
			}
			else if(d.equals(d.toUpperCase())){
				System.out.println("uppercase");
			}
			else {
				System.out.println("mixedcase");
			}
		}
		
		

}


}
