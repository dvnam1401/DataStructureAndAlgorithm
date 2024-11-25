package sort;

import java.util.Stack;

public class QuickSort {
    public static void quickSort(int[] arr) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, arr.length - 1});

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int low = range[0], high = range[1];
            if (low < high) {
                int p = partition(arr, low, high);
                stack.push(new int[]{low, p - 1});
                stack.push(new int[]{p + 1, high});
            }
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
