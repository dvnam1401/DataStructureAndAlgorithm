package sort;

public class SortedLinkedList {
    Node head;  // con trỏ đầu danh sách

    // hàm chèn nút vào danh sách liên kết được sắp xếp
    public void insertSorted(int value) {
        Node newNode = new Node(value);

        //TH1: danh sách rỗng hoặc chứa giá trị nhỏ hơn head
        if (head == null || head.data >= value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        //TH2: tìm vị trí thích hợp để chèn
        Node current = head;
        while (current.next != null && current.next.data < value) {
            current = current.next; // tiếp tục duyệt đến khi tìm đúng vị trí
        }

        // Chèn nút mới sau current
        newNode.next = current.next;
        current.next = newNode;
    }

//    hàm hiển thị danh sách liên kết
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class Node {
    int data;  // giá trị của nút
    Node next; // con trỏ đến nút tiếp theo
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}