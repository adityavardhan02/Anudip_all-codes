package apjfsa;

import java.util.ArrayDeque;

public class DemoArrayDq {

	public static void main(String[] args) {
		ArrayDeque<Integer> arque=new ArrayDeque<Integer>();
		
		arque.add(20);
		arque.add(50);
		arque.add(30);
		arque.add(50);
		
		System.out.println(arque);
		System.out.println(arque.poll());
		System.out.println(arque.peek());
		
		arque.add(10);
		arque.addFirst(5);
		arque.addLast(100);
		System.out.println(arque);
	}

}
