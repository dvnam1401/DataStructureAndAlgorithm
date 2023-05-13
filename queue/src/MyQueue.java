import java.util.NoSuchElementException;
import java.util.Scanner;

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

    public void removeQ() {
        if (head == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        int data = head.getData();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
//        return data;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap mot so khac 0 de them vao hang doi: ");
            int data = Integer.parseInt(sc.next());
            if (data == 0) {
                break;
            }
            addQ(data);
        }
        System.out.println("Da them thanh cong");
    }

    public void output() {
        System.out.print("Noi dung hang doi: ");
        if (head == null) {
            System.out.print("rong");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
        }
        System.out.println();
    }

    public int sum() {
        int sumQueue = 0;
        Node temp = head;
        while (temp != null) {
            sumQueue += temp.getData();
            temp = temp.getNext();
        }
        return sumQueue;
    }

    public int countOdd() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.getData() % 2 == 1) {
                count++;
            }
            temp = temp.getNext();
        }
        return count;
    }

    public int maxNumber() {
        if (head == null) {
            throw new NoSuchElementException("Queue");
        }
        int max = head.getData();
        Node temp = head.getNext();
        while (temp != null) {
            if (temp.getData() > max) {
                max = temp.getData();
            }
            temp = temp.getNext();
        }
        return max;
    }

    public void removeLast() {
        if (tail == null) {
            System.out.println("Queue is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.getNext() != tail) {
            temp = temp.getNext();
        }
        tail = temp;
        tail.getNext() = null;
    }


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.input();
        myQueue.output();
        myQueue.removeQ();
        myQueue.output();
        System.out.println("\nSum of queue: " + myQueue.sum());
    }
}
