package start;

public class StringMethods {
	public static void main(String[] args) {
//		String s = "i am a king";
//		System.out.println(s.length());
//		
//		int count = 0;
//		String[] f = s.split(" ");
//		
//		System.err.println(s.indexOf(s));
//		System.out.println(s.charAt(2));
//		for (int i = 0; i < f.length; i++) {
//			count++;
//		}
//		System.out.println(count);	

		String[] d = { "varun", "ddd", "ios" };
		
		int co = 0;
		int no = 0;

		for (int i = 0; i < d.length; i++) {
			char[] c = d[i].toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (c[j] == 'a' || c[j] == 'e' || c[j] == 'i' || c[j] == 'o' || c[j] == 'u') {
					// System.out.println(d[i]+" "+"contain vowels");
					co++;

				} else {
					// System.out.println(d[i]+" "+"not contain vowels");
					no++;

				}

			}

		}
		System.out.println(co);
		System.out.println(no);
		
		String a = "HAI";
		String b = a.concat("dei");
		System.out.println(b);
		
		StringBuilder t = new StringBuilder(a);
		t.append("kunju");
		System.out.println(t);
		String c = "hhhha";
		System.err.println(a.compareTo(c));
	
	}
	

}