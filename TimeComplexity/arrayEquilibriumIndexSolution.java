
public class arrayEquilibriumIndexSolution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		if(arr.length == 0){
			return -1;
		}
		int[] arr1 = new int[arr.length];
		int[] arr2 = new int[arr.length];
		arr1[0] = arr[0];
		arr2[arr2.length - 1] = arr[arr.length - 1];
		for(int i = 1; i<arr1.length; i++){
			arr1[i]=arr1[i-1]+arr[i];
		}
		for(int i = arr2.length-2; i>0; i--){
			arr2[i]=arr2[i+1]+arr[i];
		}
		for(int i = 0; i<arr.length; i++){
			if(arr1[i] == arr2[i]){
				return i;
			}
		}
		return -1;
	}
}