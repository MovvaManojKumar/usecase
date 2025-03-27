import java.util.*;

// Using TreeMap
class TreeMapDemo {
    public static void main(String[] args) {
        // Creating the new collection with TreeMap class of new object c
        Map<Integer, String> c = new TreeMap<>();

        // Adding Elements into the collection
        c.put(5, "Apple");
        c.put(2, "Banana");
        c.put(3, "Cherry");
        c.put(2, "Orange"); // Duplicate key will update value

        // Printing the elements (Sorted by key)
        for (Map.Entry<Integer, String> entry : c.entrySet()) {
            System.out.println("The collections are: Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        // Checking for duplicates using containsKey and containsValue
        System.out.println("While trying to add duplicate key: " + c.containsKey(5));
        System.out.println("Checking if value 'Apple' is present: " + c.containsValue("Apple"));

        // Removing the element from the collection using key
        c.remove(5);
        for (Map.Entry<Integer, String> entry : c.entrySet()) {
            System.out.println("The collections after removing using remove method: Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        // Getting size of the collection
        System.out.println("The size of the collection is: " + c.size());

        // Creating a new collection with object name fruits
        Map<Integer, String> fruits = new TreeMap<>();
        fruits.put(4, "Mango");
        fruits.put(5, "Grapes");

        // Adding all elements from another collection
        c.putAll(fruits);
        System.out.println("After adding all elements from fruits: " + c);

        // Checking if key is present
        System.out.println("Checking if key 2 exists: " + c.containsKey(2));
        System.out.println("Checking if key 21 exists: " + c.containsKey(21));

        // Checking if map is empty
        System.out.println("Is collection c empty? " + c.isEmpty());
        System.out.println("Is collection fruits empty? " + fruits.isEmpty());

        // Clearing collections
        c.clear();
        fruits.clear();
        System.out.println("The elements after using clear method in collection1: " + c);
        System.out.println("The elements after using clear method in collection2: " + fruits);
        System.out.println("Is collection1 empty: " + c.isEmpty());
        System.out.println("Is collection2 empty: " + fruits.isEmpty());
    }
}
