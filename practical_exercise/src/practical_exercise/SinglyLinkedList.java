package practical_exercise;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int sumOdd() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            if (current.data % 2 != 0) {
                sum += current.data;
            }
            current = current.next;
        }
        return sum;
    }

    public double averageEven() {
        int count = 0;
        int sum = 0;
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                count++;
                sum += current.data;
            }
            current = current.next;
        }
        if (count == 0) {
            return 0;
        }
        return (double) sum / count;
    }

    public int countGreaterThanThree() {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data > 3) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public int countUniqueElement() {
        Set<Integer> uniqueElements = new HashSet<>();
        Node current = head;
        while (current != null) {
            uniqueElements.add(current.data);
            current = current.next;
        }
        return uniqueElements.size();
    }

    public void swapFirstAndLast() {
        if (head == null || head.next == null) {
            return;
        }
        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        int temp = head.data;
        head.data = current.data;
        current.data = temp;
    }

    public void printSecondLastNode() {
        if (head == null || head.next == null) {
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println("Second Last Node: " + current.data);
    }

    public void reverseLinkList() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }
}

public class SinglyLinkedList {

    public static void main(String[] args) {
        File file = new File("src\\practical_exercise\\solieu.txt");
        try {
            Scanner scanner = new Scanner(file);
            int n = scanner.nextInt();

            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < n; i++) {
                int data = scanner.nextInt();
                linkedList.add(data);
            }

            System.out.print("Danh sach ban dau: ");
            linkedList.display();

            int sumOdd = linkedList.sumOdd();
            System.out.println("Tong cac so le: " + sumOdd);

            double averageEven = linkedList.averageEven();
            System.out.println("Trung binh cong cac so chan: " + averageEven);

            int countGreaterThan3 = linkedList.countGreaterThanThree();
            System.out.println("So phan tu lon hon 3: " + countGreaterThan3);

            int countUnique = linkedList.countUniqueElement();
            System.out.println("So phan tu khac nhau: " + countUnique);

            linkedList.swapFirstAndLast();
            System.out.print("Danh sach sau khi hoan vi phan tu dau va phan tu cuoi: ");
            linkedList.display();

            linkedList.printSecondLastNode();

            linkedList.reverseLinkList();
            System.out.print("Danh sach sau khi dao nguoc: ");
            linkedList.display();

            scanner.close();
        } catch (FileNotFoundException e) {
        }
    }
}
