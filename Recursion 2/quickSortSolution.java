
// asked in American Express
public class quickSortSolution {
	public static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static int quickSortHelper(int[] arr,int low,int high){
		int p = low - 1;
		int lastElement = arr[high];
		for(int i = low; i<high; i++){
			if(arr[i] < lastElement){
				++p;
				swap(arr,p,i);
			}
		}
		swap(arr, p+1, high);
		return p + 1;
	}
	public static void quickSort(int[] arr,int low, int high) {
		if(low >= high){
			return;
		}
		int correctPosition = quickSortHelper(arr,low,high);
		quickSort(arr,low,correctPosition-1);
		quickSort(arr,correctPosition+1,high);
	}
	
}