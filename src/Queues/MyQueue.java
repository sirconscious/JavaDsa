package Queues;

public class MyQueue {
    private int[] arr;
    private int topIndex = 0;     // front of the queue
    private int bottomIndex = -1; // last inserted element
    private int capacity;

    public MyQueue(int size) {
        arr = new int[size];
        capacity = size;
    }

    public void add(int value) {
        if (bottomIndex < capacity - 1) {
            arr[++bottomIndex] = value;
        } else {
            System.err.println("Queue is full!");
        }
    }

    public int poll() {
        if (!isEmpty()) {
            return arr[topIndex++];
        } else {
            System.err.println("Queue is empty!");
            return -1; // return -1 to indicate error
        }
    }

    public boolean isEmpty() {
        return topIndex > bottomIndex;
    }
}
