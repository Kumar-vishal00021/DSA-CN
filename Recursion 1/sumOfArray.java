
public class sumOfArray {
    public static int sumHelper(int[] arr,int low,int high){
        if(low==high){
            return arr[low];
        }
        if(low>high){
            return 0;
        }
        int smallAns = arr[low];
        int bigAns = sumHelper(arr, low+1, high);
        int finalAns = smallAns + bigAns;
        return finalAns;
    }
     public static int sum(int arr[]) {
         return sumHelper(arr,0,arr.length-1);
     }
 }