public class insertion_sort {
    public static void main(String args[]) {
        int arr[]={2,1,0,5,4,3};
        insertion(arr);

    }

    public static void insertion(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=key;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }

}
