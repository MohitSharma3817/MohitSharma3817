public class merge_sort {
    public static void main(String[] args) {
        int arr[] = {2, 1, 0, 5, 4, 3};
        divide(arr, 0, arr.length - 1); 
        
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void divide(int arr[], int strt, int end) {
        if (strt >= end) {
            return;
        }
        int mid = strt + (end - strt) / 2;
        divide(arr, strt, mid);
        divide(arr, mid + 1, end);
        merge(arr, strt, mid, end);
    }

    public static void merge(int[] arr, int strt, int mid, int end) {
        int[] merged = new int[end - strt + 1];
        int idx1 = strt;
        int idx2 = mid + 1;
        int k = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[k++] = arr[idx1++];
            } else {
                merged[k++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[k++] = arr[idx1++];
        }
        while (idx2 <= end) {
            merged[k++] = arr[idx2++];
        }

        for (int i = 0; i < merged.length; i++) {
            arr[strt+i] = merged[i];
        }
    }
}
