package start;

public class ReverseString {
	public static void main(String[] args) {
		String a = "varun";
		String store =" ";
	for(int i = a.length()-1;i>=0;i--) {
		store+=a.charAt(i);
	}
	System.out.println(store);
	}

}
