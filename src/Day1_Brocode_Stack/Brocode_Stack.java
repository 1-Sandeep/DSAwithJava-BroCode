package Day1_Brocode_Stack;

import  java.util.Stack;

public class Brocode_Stack {
    public static void main(String[] args) {
        //        declaring and instantiating the Stack with stackObj object
        Stack<String> stackObj = new Stack<>();

//        boolean isEmpty = stackObj.isEmpty();
//        System.out.println("Is Stack empty ? " + isEmpty);

//        push() operation adds items in Stack at top.
        stackObj.push("One");
        stackObj.push("Two");
        stackObj.push("Three");
        stackObj.push("Four");
        stackObj.push("Five");
        stackObj.push("Six");
        System.out.println("Stack Items : " + stackObj);

//        peek() operation get the top element or last added element from Stack without removing item from Stack.
        String peekedValue = stackObj.peek();
        System.out.println("Peeked Value : " + peekedValue);

//        pop() operation removes the top item of Stack.
        String poppedValue = stackObj.pop();
        System.out.println("Popped Value : " + poppedValue);
        System.out.println("Stack Items after pop() operation : " + stackObj);

//        search() operation search the item in a Stack and returns the location of item.
//        if the item is not found it returns -1.
        int itemLocation = stackObj.search("Two");
//        int itemLocation = stackObj.search("Six");
        System.out.println("Item Location is : " + itemLocation);

//        isEmpty() || empty() operation checks if the Stack is empty.
//        if empty returns : true, else returns : false
        boolean isEmpty = stackObj.isEmpty();
        System.out.println("Is Stack empty ? " + isEmpty);

//        clear() operation clears all the items from Stack
        stackObj.clear();
        System.out.println("Stack Cleared : " + stackObj);

    }
}
