//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
class CollectionsDemo {
    public static void main(String[] args) {
        //creating the new collection with arraylist class of new object c
        Collection<String> c = new ArrayList<>();
        //Adding Elements into the collection
        c.add("Manoj");
        c.add("Soarswell");
        c.add("The Debuggers");
        //printing the elements
        for (String ci : c) {
            System.out.println("the collections are:" + ci);
        }
        //Removing the element from the collection
        c.remove("Soarswell");
        for (String ci : c) {
            System.out.println("the collections after removing:" + ci);
        }
        //Creating the new collection with object name fruits
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        //Adding All elements from the another collection
        c.addAll(fruits);
        System.out.println(c);
        //checking if the element is present
        System.out.println(c.contains("Manoj"));
        System.out.println(c.contains("Kumar"));
        //checking isempty or not
        System.out.println(c.isEmpty());
        System.out.println(fruits.isEmpty());
        fruits.add("Manoj");
        c.add("Manoj");
        System.out.println(c.retainAll(fruits));
        //removing all elements from the collections ,if the both collections have the same elements then the elements will be removed from the specified collection
        System.out.println(c.removeAll(fruits));
        //printing the elements the both collections
        System.out.println(c);
        System.out.println(fruits);
    }
}