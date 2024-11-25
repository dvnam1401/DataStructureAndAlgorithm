package search;

public class BinarySearch {
     public static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) return mid; // Tìm thấy phần tử
            if (arr[mid] < x) left = mid + 1; // Tìm trong nửa phải
            else right = mid - 1; // Tìm trong nửa trái
        }
        return -1; // Không tìm thấy
    }
}
