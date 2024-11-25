package sort;

public class InsertionSort {
    // thuật toán sắp xếp chèn
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length -1; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
