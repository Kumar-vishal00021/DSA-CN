
public class checkNumberRecursively {
	public static boolean checkNumberHelper(int[] arr,int x,int low, int high){
		boolean isPresent = false;
		if(low == high){
			isPresent = arr[low] == x;
			return isPresent;
		}
		if(arr[low] == x){
			isPresent = true;
			return isPresent;
		}
		if(low > high){
			return false;
		}
		isPresent = checkNumberHelper(arr, x, low+1,high);
		return isPresent;
	}
	public static boolean checkNumber(int input[], int x) {
		return checkNumberHelper(input, x,0,input.length-1);
	}
}