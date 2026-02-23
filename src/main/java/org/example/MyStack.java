package org.example;

public class MyStack {
    private int[] array;
    private int top;
    private int size;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
        size = 0;
    }

    public void push(int value) {
        if (size >= capacity) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        array[top] = value;
        size++;
    }
}
