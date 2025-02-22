
public class lastIndexOf_x{
    public static int helper(int[] arr,int low,int high,int x){
		int lastIndex=0;
		if(arr[high]==x){
			lastIndex = high;
			return lastIndex;
		}else{
			lastIndex = -1;
		}
		if(low == high){
			return lastIndex;
		}
		return helper(arr, low, high-1, x);
	}
	public static int lastIndex(int arr[], int x) {
		return helper(arr, 0, arr.length-1, x);
	}
	
}