public class bubble_sort {
    public static void main(String args[]){
        int arr[]={2,1,0,5,4,3};
        int ans[]=bubble(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        
    }
    public static int[] bubble(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    
}
