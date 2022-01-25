package start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		Integer[] a = { 8, 9, 5, 46, 11, 33 };
		Arrays.sort(a);
		for (Integer aa : a) {
			System.out.println(aa);
		}
		System.out.println("........reverse using Sort method .............");
		Arrays.sort(a, Collections.reverseOrder());
		for (Integer bb : a) {
			System.out.println(bb);
		}
		System.out.println("...........reverse using  Reverse method............");
		String[] s = { "jack", "arun", "zack", "murali" };
		List<String> li = new ArrayList<>(Arrays.asList(s));
		Collections.sort(li, Collections.reverseOrder());
		for (String h : li) {
			System.out.println(h);
		}
		System.out.println("...........using stream sorted method...........");
		li = li.stream().sorted().collect(Collectors.toList());
		for (String bb : li) {
			System.out.println(bb);
		}
	}

}
