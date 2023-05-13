public class MyQueue {
    Node head, tail;

    public MyQueue() {
        head = tail = null;
    }

    private boolean emptyQ() {
        return head == null;
    }
}
