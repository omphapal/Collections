package arraylist;

import java.util.ArrayList;

//you must import Arraylist to us it
public class Arraylist {

	public static void main(String[] args) {
		
		//1. Create (initialize) an arraylist of Strings
		ArrayList<String> shoppingList=new ArrayList<>();
		
		//2.add elements (create)
		shoppingList.add("Milk");
		shoppingList.add("Bread");
		shoppingList.add("Eggs");
		
		System.out.println("initial list "+shoppingList);
		
		// 3. Access an element (Read)
        // Indexes start at 0
		String secondItem =shoppingList.get(1);
		System.out.println("The second item is "+secondItem);
		
		// 4. Change an element (Update)
        // Change "Bread" (at index 1) to "Butter"
		shoppingList.set(1,"Butter");
		System.out.println("Ipdate List"+shoppingList);
		
		// 5. Remove an element (Delete)
        // You can remove by index
		shoppingList.remove(0);//remove milk
		System.out.println("After removing item 0"+shoppingList);
		
		// You can also remove by value
		shoppingList.add("apple");
		shoppingList.remove("Eggs");
		System.out.println("After removing eggs "+shoppingList);
		
		
		// 6. Get the size (length)
		int listSize=shoppingList.size();
		System.out.println("The list size is"+listSize);	
		
		//7 Iterate (loop) through the list
		System.out.println("--Shoping list item");
		for(String item:shoppingList) {
		System.out.println(item);
		}
		
		// 8. Check if the list contains an item
		boolean hasButter = shoppingList.contains("Butter");
        System.out.println("Does the list have Butter? " + hasButter);

        // 9. Clear the entire list
        shoppingList.clear();
        System.out.println("After clearing: " + shoppingList);
        System.out.println("Is the list empty? " + shoppingList.isEmpty());
	}
}
