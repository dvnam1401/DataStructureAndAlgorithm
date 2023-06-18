import java.util.NoSuchElementException;

public class MyQueue {
    private Node head, tail;

    public MyQueue() {
        head = tail = null;
    }

    public boolean emptyQ() {
        return head == null;
    }

    public void addQ(int number) {
        Node newNode = new Node(number);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public int removeQ() {
        if (head == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        int data = head.getData();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        return data;
    }
}
