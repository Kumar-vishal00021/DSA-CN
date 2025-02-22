
public class countSmall {
    public static int[] countS(int n, int m, int []a, int []b) {
        // Write your code here.
        int[] output = new int[n];
        sort(a, n);
        sort(b, m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i] < b[j]){
                    break;
                }else if(a[i]>=b[j]){
                    output[i] = output[i] + 1;
                }
            }
        }
        return output;
    }
    public static void sort(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}