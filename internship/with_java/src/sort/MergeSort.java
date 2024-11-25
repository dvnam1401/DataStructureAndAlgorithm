package sort;

public class MergeSort {
    // sap xep hop nhat
    static void mergeSort(int arr[], int l, int m, int r) {
        // kich thuoc 2 mang con duoc hop nhat
        int n1 = m - 1 + 1;
        int n2 = r - m;

        // tao mang tam thoi
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // ghep 2 mang tam
        // chi so ban dau cua mang con 1 va 2
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            mergeSort(arr, l, m, r);
        }
    }
}
