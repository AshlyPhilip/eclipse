package collections;

import java.util.ArrayDeque;

public class collectionpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> que = new ArrayDeque<String>();
		
		que.add("Ashly");
		que.add("98");
		que.add("somney");
		que.add("89.6");
		que.add("Evana");
		que.add("88.9");
		
		System.out.println(que);
		que.addFirst("Evaan");
		que.addLast("Alice");
		System.out.println(que);

		System.out.println(que.peek());
		que.poll();
		System.out.println(que);
		System.out.println(que.peekFirst());
		que.pollFirst();
		System.out.println(que);
		
		System.out.println(que.peekLast());
		que.pollLast();
		System.out.println(que);

				
	}

}
