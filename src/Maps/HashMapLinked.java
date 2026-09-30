package Maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> ob = new LinkedHashMap<Integer, String>(); // TreeMap<Integer, String> ob = new
																					// Treemap<Integer, String>();

		ob.put(100, "amiya");
		ob.put(105, "ashlu");
		ob.put(250, "java");
		ob.put(4, "harita");

		System.out.println(ob);

		Set mapset = ob.entrySet();
		Iterator itr = mapset.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();

			System.out.println(entry.getKey() + "==" + entry.getValue());
		}
	}

}
