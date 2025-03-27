import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {
        // Creating the new collection with HashMap class of new object c
        Map<Integer, String> c = new HashMap<>();
        // Adding Elements into the collection
        c.put(5, "Apple");
        c.put(2, "Banana");
        c.put(3, "Cherry");
        c.put(2, "Orange"); // Duplicate key will update value
        // Printing the elements
        for (Map.Entry<Integer, String> entry : c.entrySet()) {
            System.out.println("The HashMap are: Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        // Checking for duplicates using containsKey and containsValue
        System.out.println("While trying to add duplicate key: " + c.containsKey(5));
        System.out.println("Checking if value 'Apple' is present: " + c.containsValue("Apple"));
        // Removing the element from the collection using key
        c.remove(5);
        for (Map.Entry<Integer, String> entry : c.entrySet()) {
            System.out.println("The HashMap after removing using remove method: Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        // Getting size of the collection
        System.out.println("The size of the HashMap is: " + c.size());
        // Creating a new collection with object name fruits
        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(4, "Mango");
        fruits.put(5, "Grapes");
        // Adding all elements from another collection
        c.putAll(fruits);
        System.out.println("After adding all elements from fruits: " + c);
        // Checking if key is present
        System.out.println("Checking if key 2 exists: " + c.containsKey(2));
        System.out.println("Checking if key 21 exists: " + c.containsKey(21));
        // Checking if map is empty
        System.out.println("Is HashMap c empty? " + c.isEmpty());
        System.out.println("Is HashMap fruits empty? " + fruits.isEmpty());
        // Clearing collections
        c.clear();
        fruits.clear();
        System.out.println("The elements after using clear method in HashMap1: " + c);
        System.out.println("The elements after using clear method in HashMap2: " + fruits);
        System.out.println("Is collection1 empty: " + c.isEmpty());
        System.out.println("Is collection2 empty: " + fruits.isEmpty());
    }
}

//output
The HashMap are: Key = 2, Value = Orange
The HashMap are: Key = 3, Value = Cherry
The HashMap are: Key = 5, Value = Apple
While trying to add duplicate key: true
Checking if value 'Apple' is present: true
The HashMap after removing using remove method: Key = 2, Value = Orange
The HashMap after removing using remove method: Key = 3, Value = Cherry
The size of the HashMap is: 2
After adding all elements from fruits: {2=Orange, 3=Cherry, 4=Mango, 5=Grapes}
Checking if key 2 exists: true
Checking if key 21 exists: false
Is HashMap c empty? false
Is HashMap fruits empty? false
The elements after using clear method in HashMap1: {}
The elements after using clear method in HashMap2: {}
Is collection1 empty: true
Is collection2 empty: true
