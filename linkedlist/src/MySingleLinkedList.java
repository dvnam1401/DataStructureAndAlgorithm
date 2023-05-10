import java.util.Scanner;

public class MySingleLinkedList {
    static Node head;

    public MySingleLinkedList() {
        head = null;
    }

    static void append(int x) {
    }

    static void add(int x) {
        head = new Node(x, head);
    }

    static void insert(int x, int k) {

    }

    static void remove(int k) {

    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int i = 0;
        Node p = null;
        Node head = null;
        while (true) {
            System.out.print("\nNhap gia tri thu " + i + ": ");
            x = Integer.parseInt(sc.next());
            if (x == 0) {
                break;
            }
            Node t = new Node(x);
            if (head == null) {
                head = p = t;
            } else {
                p.setNext(t);
                p = t;
            }
            i++;
        }
    }

    static void output() {
        System.out.print("Noi dung danh sach: \n====> ");
        Node p = head;
        while (p != null) {
            System.out.print(p.getData() + " ");
            p = p.getNext();
        }
        System.out.print("null\n");
    }

    static int count() {
        int count = 0;
        Node p = head;
        while (p != null) {
            count++;
            p = p.getNext();
        }
        return count;
    }

    static int sum() {
        int sum = 0;
        Node p = head;
        while (p != null) {
            sum += p.getData();
            p = p.getNext();
        }
        return sum;
    }

    static int countOdd() {
        int count = 0;
        Node p = head;
        while (p != null) {
            if (p.getData() % 2 != 0) {
                count++;
            }
            p = p.getNext();
        }
        return count;
    }

    //tìm số lớn nhất
    static int max() {
        int numberMax = 0;
        if (head == null) {
            return numberMax;
        } else {
            numberMax = head.getData();
        }
        Node p = head;
        while (p != null) {
            if (numberMax < p.getData()) {
                numberMax = p.getData();
            }
            p = p.getNext();
        }
        return numberMax;
    }

    // in số cuối cùng
    static int lastNumber() {
        if (head == null) {
            return 0;
        } else {
            Node p = head;
            while (true) {
                if (p.getNext() == null) {
                    return p.getData();
                }
                p = p.getNext();
            }
        }
    }
    // tính trung bình cộng
    static double average() {
        int sum = 0;
        if (head == null) {
            return sum;
        } else {
            Node p = head;
            while (p != null) {

            }
        }
    }
    // in số thứ k
    // tính tổng các số ở vị trí chẵn (ban đầu là 1)

    public static void main(String[] args) {
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);
        output();
        System.out.println(lastNumber());
    }
}
