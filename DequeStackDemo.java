  package arraylist;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackDemo {

	public static void main(String[] args) {
		// Use Deque, implemented as ArrayDeque
		Deque<String> bh=new ArrayDeque<>();
		
		// 1. Push (add to the front)
		bh.push("Google.com");
		bh.push("Github.com");
		
		
		//2.peek (look at the front)
		System.out.println("Current page"+bh.peek());
		
		
		//3.pop (remove  from the front)
		String pr=bh.pop();
		System.out.println("Went back from "+pr);
		
		System.out.println("New current page "+bh.peek());
		
		
		
	}
}
