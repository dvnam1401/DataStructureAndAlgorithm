def merge(arr, left, mid, right):
    n1 = mid - left + 1
    n2 = right -mid

    # Tạo mảng tạm thời L[] và R[]
    L = [0] * n1
    R = [0] * n2
    
    # sao chep du lieu vao 2 mang tam L[] va R[]
    for i in range(n1):
        L[i] = arr[left + i]
    for j in range(n2):
        R[j] = arr[mid + 1 + j]
    i = 0 # chi sang ban dau cua mang con dau tien
    j = 0  # chi sang ban dau cua mang con thu hai
    k = left # chi sang ban dau cua mang con hop nhat
    
    # Hợp nhất lại các mảng tạm thời
    # vào mảng[left..right]
    while i < n1 and j < n2:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1

    # Sao chép các phần tử còn lại của L[],
    # nếu có
    while i < n1:
        arr[k] = L[i]
        i += 1
        k += 1
    
    # Sao chép các phần tử còn lại của R[],
    # nếu có
    while j < n2:
        arr[k] = R[j]
        j += 1
        k += 1

def merge_sort(arr, left, right):
    if left < right:
        mid = (left + right) // 2

        merge_sort(arr, left, mid)
        merge_sort(arr, mid + 1, right)
        merge(arr, left, mid, right)

def print_list(arr):
    for i in arr:
        print(i, end=" ")
    print()

if __name__ == "__main__":
    arr = [12, 11, 13, 5, 6, 7]
    n = len(arr)
    print("Given array is", end="\n")
    print_list(arr)
    merge_sort(arr, 0, n - 1)
    print("Sorted array is: ", end="\n")
    print_list(arr)
