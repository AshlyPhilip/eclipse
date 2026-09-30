package collections;

import java.util.HashSet;

public class collectionHashset {

	public static void main(String[] args) {
		HashSet<String> ob = new HashSet<String>();

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

	}
}
