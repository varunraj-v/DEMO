package start;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseVehicle {
	public static void main(String[] args) {
		Vehicle v5 = new Vehicle(15, "two wheeler", "tata", 1750);
		Vehicle v1 = new Vehicle(155, "four wheeler", "bmw", 1866);
		Vehicle v2 = new Vehicle(113, "two wheeler", "audi", 1980);
		Vehicle v3 = new Vehicle(1, " three wheeler", "susuki", 2011);
		Vehicle v4 = new Vehicle(12, "four wheeler", "bajaj", 1555);
		ArrayList<Vehicle> li = new ArrayList<>();
		li.add(v4);
		li.add(v3);
		li.add(v2);
		li.add(v1);
		li.add(v5);
		BrandComparator bb = new BrandComparator();
		Collections.sort(li, bb.reversed());
		for (Vehicle g : li) {

			System.out.println(g.getBrand() + " " + g.getType() + " " + g.getYear() + " " + g.getId());
		}

		YearComparator y = new YearComparator();
		Collections.sort(li, y);
		for (Vehicle j : li) {
			System.out.println(j.getYear() + " " + j.getId() + " " + j.getBrand() + " " + j.getType());
			System.err.println(j);
		}
		List<String> lii=li.stream().map(x->x.getBrand().toUpperCase()).collect(Collectors.toList());
		System.out.println(lii);
		List<Vehicle> liii=li.stream().filter(x->x.getYear()>1500).collect(Collectors.toList());
		System.out.println(liii);
		

	}

}
