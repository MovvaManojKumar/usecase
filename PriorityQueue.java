//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
class CollectionsDemo {
    public static void main(String[] args) {
        //creating the new collection with arraylist class of new object c
        Queue<Integer> c = new PriorityQueue<>() ;

        //Adding Elements into the collection
        c.add(5);
        c.add(2);
        c.add(3);
        c.add(2);
        //printing the elements
        for (int ci : c) {
            System.out.println("the collections are:" + ci);
        }
        System.out.println("While trying to add the elements in the print St of duplicate values: "+c.add(5));
        //adding elements based on the index value
        c.remove(2);
//        for (int ci : c) {
//            System.out.println("the collections are:" + ci);
//        }
       //Removing the element from the collection
        c.remove(5);
        for (int  ci : c) {
            System.out.println("the collections after removing using remove method:" + ci);
        }
        //Getting Top Element
        System.out.println("The Top Element is: "+c.peek());
        System.out.println(" Before removing the top element the size of the collection is: "+c.size());
        //Remove Top Element
        System.out.println("Removing Top Element: "+c.poll());
        //getting the size of the set
        System.out.println("The size of the collection is: "+c.size());
        //Creating the new collection with object name fruits
        Queue<Integer> fruits = new PriorityQueue<>();
        fruits.add(4);
        fruits.add(5);
        //Adding All elements from the another collection
        System.out.println(c);
        //checking if the element is present
        System.out.println(c.contains(2));
        System.out.println(c.contains(21));
        //checking isempty or not
        System.out.println(c.isEmpty());
        System.out.println(fruits.isEmpty());
        fruits.add(7);
        c.add(0);
        System.out.println("Elements after adding some elements: "+c);
        System.out.println(c.retainAll(fruits));
        //removing all elements from the collections ,if the both collections have the same elements then the elements will be removed from the specified collection
        System.out.println(c.removeAll(fruits));
        //printing the elements the both collections
        System.out.println(c);
        System.out.println(fruits);
        fruits.clear();
        c.clear();
        System.out.println("the elements after using clear method in collection1: "+c);
        System.out.println("the elements after using clear method in collection2: "+fruits);
        System.out.println("is the collection1 empty : "+c.isEmpty());
        System.out.println("is the collection2 empty : "+ fruits.isEmpty());
    }
}