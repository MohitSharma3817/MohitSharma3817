public class selection_sort {
    public static void main(String args[]){
        int arr[]={2,1,0,5,4,3};
        int ans[]=selection(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }

    }
    public static int[] selection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
            if(minidx!=i){
                int temp=arr[minidx];
                arr[minidx]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;

    }
    
}
