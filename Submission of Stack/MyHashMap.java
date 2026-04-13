class MyHashMap {
    class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    Node[] bucket = new Node[10];

    void put(int key, int value) {
        int index = key % 10;
        Node head = bucket[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = bucket[index];
        bucket[index] = newNode;
    }
}