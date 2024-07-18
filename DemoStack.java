package apjfsa;

import java.util.ArrayList;
import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		stack.push(10);
		stack.add(20);
		stack.push(30);
		stack.push(50);
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.search(10));
		
	}

}
