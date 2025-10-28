public class quick_sort {
    public static void main(String args[]){
        int arr[] = {2, 1, 0, 5, 4, 3};
        quick(arr, 0, arr.length - 1); 
        
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
    public static void quick(int arr[],int strt,int end){
        if(strt>=end){
            return;
        }
        int pivot=partition(arr,strt,end);
        quick(arr, strt, pivot-1);
        quick(arr, pivot+1,end);
    }
    public static int partition(int arr[],int strt,int end){
        int idx=strt-1;
        int pivot=arr[end];
        for(int i=strt;i<=end;i++){
            if(arr[i]<pivot){
                idx++;
                swap(arr, idx, i);
            }
        }
        idx++;
        swap(arr, idx, end);
        return idx;

    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    

}
