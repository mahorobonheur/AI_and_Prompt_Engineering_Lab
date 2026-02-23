package org.example;

public class MyStack {

        private int[] stack;
        private int top;
        private int capacity;

        public MyStack(int capacity) {
            this.capacity = capacity;
            this.stack = new int[capacity];
            this.top = -1;
        }

        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot push " + value);
                return;
            }
            stack[++top] = value;
            System.out.println(value + " pushed to stack");
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! Cannot pop");
                return -1;
            }
            return stack[top--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

}
