package Maps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> ob = new TreeMap<Integer, String>();

		ob.put(100, "amiya");
		ob.put(105, "ashlu");
		ob.put(250, "java");
		ob.put(4, "harita");

		System.out.println(ob);

		Set mapset = ob.entrySet();
		Iterator itr = mapset.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();

			// System.out.println(entry.getKey());
			// System.out.println(entry.getValue());
			System.out.println(entry.getKey() + "==" + entry.getValue());
		}
	}
}
