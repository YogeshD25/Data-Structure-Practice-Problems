package dsa.queue.general;

import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class CreatePriorityQueueExample {
    public static void main(String[] args) {
        // Create a Priority Queue

        SortedSet<Integer> myNumbers = new TreeSet<>();
        myNumbers.add(750);
        myNumbers.add(500);
        myNumbers.add(900);
        myNumbers.add(100);


        System.out.println(myNumbers);






        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);


        System.out.println("adasda"+ numbers.poll());

        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }

    }
}