
public class findKthSmallest {
    public static int kthSmallest(int[] arr, int n, int k){
        //Your code goes here
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[k-1];
    }

}