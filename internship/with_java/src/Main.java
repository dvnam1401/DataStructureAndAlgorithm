import sort.SortedLinkedList;

public class Main {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        // Thêm các nút vào danh sách
        list.insertSorted(10);
        list.insertSorted(5);
        list.insertSorted(15);
        list.insertSorted(12);

        // Hiển thị danh sách
        list.display(); // Kết quả: 5 -> 10 -> 12 -> 15 -> null
    }
}