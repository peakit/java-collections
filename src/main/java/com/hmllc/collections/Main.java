package com.hmllc.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "mango";
        fruits[2] = "papaya";
        System.out.println(Arrays.toString(fruits));

        fruits = new String[] {"guava", "kiwi"};
        System.out.println(Arrays.toString(fruits));

        for(int i=0; i<fruits.length; i++) {
            fruits[i] = fruits[i].toUpperCase();
        }
        System.out.println(Arrays.toString(fruits));

        // Stack via Deque (pronounced as "Deck")
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println(stack);

        stack.poll();   // equivalent to pop and does not throw NoElementFoundException
        System.out.println(stack);
        System.out.println(stack.peek());

        // Queue (using PriorityQueue implementation)
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

        // Set
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(495);
        set.add(73);
        set.add(6);
        System.out.println(set);

        Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));
        wordSet.add("tiger");
        wordSet.add("lion");
        wordSet.add("giraffe");
        wordSet.add("wolf");
        System.out.println(wordSet);
    }
}
