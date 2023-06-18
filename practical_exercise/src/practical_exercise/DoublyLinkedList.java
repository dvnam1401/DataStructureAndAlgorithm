/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author vanna
 */
class MyLinkedList {

    private class Node {

        int value;
        Node next;
        Node previous;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    private Node head;
    private Node tail;

    private int size = 0;

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int e) {
        Node node = new Node(e);
        if (head == null) {
            tail = node;
            head = tail;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    public int sumOdd() {
        Node temp = this.head;
        int res = 0;
        while (temp != null) {
            if (temp.value % 2 == 1) {
                res += temp.value;
            }
            temp = temp.next;
        }
        return res;
    }

    public float averageEven() {
        Node temp = this.head;
        float res = 0;
        int count = 0;
        while (temp != null) {
            if (temp.value % 2 == 0) {
                res += temp.value;
                count++;
            }
            temp = temp.next;
        }
        res = res / count;
        return res;
    }

    public int countGreaterThanThree() {
        Node temp = this.head;
        int res = 0;
        while (temp != null) {
            if (temp.value > 3) {
                res++;
            }
            temp = temp.next;
        }
        return res;
    }

    public int countUniqueElement() {
        Node current = head;
        int res = 0;
        boolean isEqualTail = false;
        for (int i = 0; i < this.size - 1; i++) {
            Node node = current.next;
            boolean isEqual = false;
            for (int j = i + 1; j < this.size; j++) {
                if (node.value == current.value) {
                    isEqual = true;
                    break;
                }
                node = node.next;
            }
            if (current.value == tail.value) {
                isEqualTail = true;
            }
            if (!isEqual) {
                res++;
            }
            current = current.next;
        }
        return isEqualTail ? res : res + 1;
    }

    public void changeHeadTail() {
        Node nextHead = this.head.next;
        Node previousTail = this.tail.previous;
        this.head.next.previous = null;
        this.head.next = null;
        this.tail.previous.next = null;
        this.tail.previous = null;
        Node temp = head;
        this.head = tail;
        this.tail = temp;
        this.head.next = nextHead;
        nextHead.previous = this.head;
        this.tail.previous = previousTail;
        previousTail.next = tail;
    }

    public void reverseLinkList() {
        Node pHead = this.head;
        Node pTail = this.tail;
        for (int i = 0; i < size / 2; i++) {
            int temp = pHead.value;
            pHead.value = pTail.value;
            pTail.value = temp;
            pHead = pHead.next;
            pTail = pTail.previous;
        }
    }

    public int showPreviousTail() {
        return this.tail.previous.value;
    }
}
public class DoublyLinkedList {

    public static void main(String[] args) {
        File file = new File("src\\practical_exercise\\solieu.txt");
        try {
            Scanner sc = new Scanner(file);
            int n = sc.nextInt();

            MyLinkedList linkedList = new MyLinkedList();
            for (int i = 0; i < n; i++) {
                int data = sc.nextInt();
                linkedList.add(data);
            }
            System.out.println("Danh so ban dau: ");
            linkedList.display();

            int sumOdd = linkedList.sumOdd();
            System.out.println("Tong cac so le: " + sumOdd);
            
            double avg = linkedList.averageEven();
            System.out.println("Trung binh cong cac so chan: " + avg);

            int countGreaterThan3 = linkedList.countGreaterThanThree();
            System.out.println("So phan tu lon hon 3: " + countGreaterThan3);
            
            int countUnique = linkedList.countUniqueElement();
            System.out.println("So phan tu khac nhau: " + countUnique);
            
            linkedList.changeHeadTail();
            System.out.println("Danh sach sau khi hoan vi phan tu dau va cuoi: ");
            linkedList.display();
            
            linkedList.showPreviousTail();
            
            linkedList.reverseLinkList();
            System.out.println("Danh sach sau khi dao nguoc: ");
            linkedList.display();
        } catch (FileNotFoundException e) {
        }
    }

}
