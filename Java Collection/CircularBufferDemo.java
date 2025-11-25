import java.util.*;

class CircularBuffer {
    int[] arr;
    int front = 0, size = 0;
    int capacity;

    CircularBuffer(int c) {
        capacity = c;
        arr = new int[c];
    }

    void add(int x) {
        arr[(front + size) % capacity] = x;
        if(size < capacity) size++;
        else front = (front + 1) % capacity; // overwrite
    }

    void printBuffer() {
        for(int i=0; i<size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class CircularBufferDemo {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.printBuffer();

        cb.add(4);   // overwrites 1
        cb.printBuffer();
    }
}
