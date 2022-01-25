package start;

public class StringMethods {
	public static void main(String[] args) {
		String s = "i am a king";
		
		int count = 0;
		String[] f = s.split(" ");
		
		System.out.println(s.indexOf(s));
		System.out.println(s.charAt(4));
		for (int i = 0; i < f.length; i++) {
			count++;
		}
		System.out.println(count);		
	}

}
