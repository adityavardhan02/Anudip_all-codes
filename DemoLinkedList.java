package apjfsa;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList<Double> llist=new LinkedList<Double>();
		
		llist.add(7090.07);
		llist.add(2009.09);
		llist.add(3000.09);
		llist.add(4500.19);
		llist.add(4000.02);
		llist.add(2200.01);
		
		System.out.println(llist);
		System.out.println(llist.size());
		
		llist.remove(0);
		System.out.println(llist);
		llist.push(4302.32);
		
		Iterator<Double> itr=llist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Max="+Collections.max(llist));
		System.out.println("Min="+Collections.min(llist));

		Collections.sort(llist);
		System.out.println(llist);
		
		System.out.println(Collections.reverseOrder());
		Collections.reverse(llist);
		System.out.println(llist);
		

	}

}
