package arraylist;
import java.util.HashMap;


public class HashSet {

	public static void main(String[]args) {
		
		// 1. Create a HashMap
        // This one maps a String (name) to an Integer (age)
        HashMap<String, Integer> studentAges = new HashMap<>();

        // 2. Add elements (key-value pairs) using .put()
        studentAges.put("Omkar", 22);
        studentAges.put("Priya", 21);
        studentAges.put("Rahul", 23);

        System.out.println("Map of student ages: " + studentAges);

        // 3. Get a value using its key with .get()
        Integer omkarsAge = studentAges.get("Omkar");
        System.out.println("Omkar's age is: " + omkarsAge);

        // 4. Check if a key exists
        boolean hasPriya = studentAges.containsKey("Priya");
        System.out.println("Does the map have a key 'Priya'? " + hasPriya);
        
        // 5. Remove a pair by its key
        studentAges.remove("Rahul");
        System.out.println("After removing Rahul: " + studentAges);
	}
}
