
public class secondLargest {  

    public static int secondLargestElement(int[] arr, int n) {
    	//Your code goes here
        int large = 0;
        int secondLargest=0;
        for(int i=0; i<n; i++){
            if(arr[i] > large){
                secondLargest = large;
                large = arr[i];
            }else if(arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}