package Day2_Brocode_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Brocode_Queue {
    public static void main(String[] args) {

//        declaring queueObj from Queue class, but cannot be instantiated as Queue is an interface.
//        We have to use a class which implements Queue.
//        There are 2 types of class which implements Queue : 1) LinkedList      2) PriorityQueue
//        Here we have instantiated using LinkedList<>

        Queue<String> fruitQueue = new LinkedList<>();

//        add() && offer() methods both are used to enqueue elements to queue
//        difference is that offer() will return false if it fails to insert the element on a size restricted Queue,
//        whereas add() will throw an IllegalStateException.
//        You should use offer() when failure to insert an element would be normal,
//        and add() when failure would be an exceptional occurrence (that needs to be handled).
//        in this case it doesn't matter as we have no constraint in queue
        fruitQueue.add("Apple");
        fruitQueue.add("Mango");
        fruitQueue.add("Banana");
        fruitQueue.offer("DragonFruit");
        fruitQueue.offer("Litchi");
        fruitQueue.offer("Orange");
        System.out.println("Fruits in Store : " + fruitQueue);

//        peek() && element() methods both are used to retrieve the item/element from head of queue without removing
//        difference is that peek() returns null if queue is empty
//        whereas element() throws an exception if the queue is empty
        String peekedElement = fruitQueue.peek();
        System.out.println("Peaked Item/Element : " + peekedElement);
        String elementElement = fruitQueue.element();
        System.out.println("Element Item/Element : " + elementElement);

//        poll() && remove() methods both are used remove the head of the queue
//        different is that poll() returns null if queue is empty
//        whereas remove() throws an exception if the queue is empty
//        String polledElement = queueObj.poll();
//        System.out.println("Polled Item/Element : " + polledElement);
//        String removedElement = queueObj.remove();
//        System.out.println("Removed Item/Element : " + removedElement);

//        Collection class methods
//        size() method gives the length or size of queue
        int queueSize = fruitQueue.size();
        System.out.println("Items in Queue : " + queueSize);

//        isEmpty() || empty() method checks of the queue is empty or not, if empty returns true else returns false.
//        boolean isEmpty = fruitQueue.isEmpty();
//        System.out.println("Is Queue is empty ? " + isEmpty);

//        contains() method checks of the object is in queue, if object is in queue then returns true else return false
        boolean doesContain = fruitQueue.contains("Banana");
        System.out.println("Is Fruit in Queue ? " + doesContain);

//        clear() methods removes all the element form queue
        fruitQueue.clear();
        System.out.printf("Fruits in Line : " + fruitQueue);


    }
}
