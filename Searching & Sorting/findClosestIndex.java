
public class findClosestIndex {
    public static int binarySearchClosest(int []arr, int left, int right, int target) {
        //Your code goes here
        int diff= Integer.MAX_VALUE;
        int diffIndex=0;
        while(left<=right){
            int mid = (left+right)/2;
            if(target==arr[mid]){
                return mid;
            }else if(Math.abs(target-arr[mid])<diff){
                diff=Math.abs(target-arr[mid]);
                diffIndex=mid;
            }
            if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return diffIndex;
    }

}