package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> ob = new LinkedHashSet<String>();

		ob.add("Ashly");
		ob.add("Soney");
		ob.add("Honey");
		ob.add("Evann");
		ob.add("Evana");
		ob.add("Rani");

		System.out.println(ob);

		for (String data : ob) {
			System.out.println(data);
		}
		ob.add("Ashly");
		System.out.println(ob);

		ob.add(null);
		System.out.println(ob);

		// keep the order we given

	}

}
