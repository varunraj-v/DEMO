package start;

public class Primeno {
	public static void main(String[] args) {
		int num = 10;
		boolean isprime = false;		
		for (int i = 2; i <num; i++) {
			if(num%i==0) {
				isprime=true;
				break;
			}
			
		}if(isprime) {
			System.out.println("np");
		}
		else {
			System.out.println(" prime");
		}
		
		
		
	}

}
