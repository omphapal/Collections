package arraylist;
//You must import the Stack class
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// 1. Create a Stack
		Stack<String> bh=new Stack<>();
		
		// 2. Push items onto the stack (visiting pages)
		bh.push("www.google.com");
		bh.push("www.geeks.com");
		bh.push("My_profile.com");
		
		System.out.println("Current stack"+bh);
		
		// 3. Peek at the top item
        // This shows us the current page.
		String currentPage=bh.peek();
		System.out.println("Current page is "+currentPage);
		
		// 4. Pop an item (pressing the "back" button)
        // This removes and returns the top item.
		String pp= bh.pop();
		
		// 5. Check the stack again
		System.out.println("Current Statck "+bh);
		System.out.println("New current page is "+bh.peek());
		
		// 6. Check if the stack is empty
		System.out.println("is the history empty"+bh.isEmpty());
		
		// 7. Pop all remaining items
		bh.pop();
		bh.pop();
System.out.println("Is the history empty now? " + bh.isEmpty());
        
        // 8. Trying to pop from an empty stack
        // This will cause an "EmptyStackException"
	
try {
	bh.pop();
}
catch(Exception e){
	System.out.println("Error"+e.getMessage());// Will say "EmptyStackException"
    }
 }
		
	
}
