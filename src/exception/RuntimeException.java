package exception;

public class RuntimeException {
	public static void main(String[] args) {
		int num = 5;
		int val;
//		String s= null;
//		System.out.println(s.length());
		try {
			 val= num/0;
	
			
		}catch(Exception e) {
			System.out.println("sam exception occurs "+" "+e);
		
		}
		finally {
			System.out.println("no exception");
		}
		
		
		
		
	}

}
