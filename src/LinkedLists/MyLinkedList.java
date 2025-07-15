package LinkedLists;


public class MyLinkedList {
    Node head;

    // Add to front
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add to end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Print list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Delete from front
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Delete from end
    public void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.printList(); // 10 → 20 → 30 → null

        list.deleteFirst();
        list.printList(); // 20 → 30 → null

        list.deleteLast();
        list.printList(); // 20 → null
    }
}
