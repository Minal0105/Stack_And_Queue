package com.Bridgelabz;
import java.util.LinkedList;

public class Stack<T>
{
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(T value) {
        stack.addFirst(value);
    }

    public T peek() {
        return stack.getFirst();
    }

    public int size() {
        return stack.size();
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Stack elements:");
        for (Integer element : stack.stack) {
            System.out.println(element);
        }

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

    }
}
