package Day3_Brocode_PriorityQueue;

import java.util.*;

public class Brocode_PriorityQueue {
    public static void main(String[] args) {
//        declaring and instantiating queue through LinkedList class,
//        as Queue is an interface which doesn't create an instance.
//        And LinkList and PriorityQueue are only class that implements Queue class.
        Queue<String> queueObj = new PriorityQueue<>(Collections.reverseOrder());
//        //        enqueuing items in a queue, whose object is => queueObj
        queueObj.add("Mango");
        queueObj.add("Banana");
        queueObj.add("Apple");
        queueObj.add("Dragon Fruit");
        queueObj.add("JackFruit");
//
//
////        this line will display the elements present in queue,
////        while pulling out from queue and printing out until queue is empty
        while (!queueObj.isEmpty()) {
            String fruits = queueObj.poll();
            System.out.println(fruits);
        }

//        in this line we are declaring and instantiating through PriorityQueue class
//        Queue<Double> queueObj = new PriorityQueue<>(
//                Collections.reverseOrder() // a comparator that reverses the queue items
//        );
////        enqueuing 6th semester grade
//        queueObj.offer(2.2);
//        queueObj.offer(3.36);
//        queueObj.offer(3.57);
//        queueObj.offer(3.24);
//        queueObj.offer(2.41);
//        queueObj.offer(3.24);
//        queueObj.offer(3.45);
//        queueObj.offer(3.29);
////        numbers in priority queue are arranged in ascending order
////        so inorder to put items in descending order or reverse order, we need to pass a Comparator in PriorityQueue<>() constructor.
////        the comparator is Collection.reverseOrder() method
//
//        while (!queueObj.isEmpty()){
//            System.out.println(queueObj.poll());
//        }


    }
}
