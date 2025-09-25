package org.example.task2;

public class IntStack {
    private int[] data;
    private int size;
    private static final int DEFAULT_SIZE = 10;

    public IntStack() {
        this.data = new int[DEFAULT_SIZE];
        this.size = 0;
    }

    public void push(int value) {
        if (size == data.length) {
            grow();
        }
        data[size++] = value;
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        int value = data[--size];
        data[size] = 0;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        return data[size - 1];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = 0;
        }
        size = 0;
    }

    private void grow() {
        int newSize = data.length * 2;
        int[] newData = new int[newSize];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    public static void main(String[] args) {
        IntStack stack = new IntStack();
        stack.push(100);
        stack.push(200);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        stack.clear();
        System.out.println("After clear, pop: " + stack.pop());
    }
}

