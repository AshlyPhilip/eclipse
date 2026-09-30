package collections;

import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ob = new TreeSet<String>();
		

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

		//ob.add(null);
		//System.out.println(ob);
		
		
		// in reeset we cant add null  and 
		//printing in ascending order
	}

}
