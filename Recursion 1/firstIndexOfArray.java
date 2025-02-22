

public class firstIndexOfArray {
    public static int firstIndexHelper(int[] arr,int low,int high,int x){
		int index=0;
		if(arr[low] == x){
			index = low;
			return index;
		}else{
			index = -1;
		}
		if(low == high){
			return -1;
		}
		index = firstIndexHelper(arr, low+1, high, x);
		return index;
	}
	public static int firstIndex(int input[], int x) {
		return firstIndexHelper(input,0,input.length-1,x);
	}
	
}