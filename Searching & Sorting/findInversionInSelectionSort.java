
public class findInversionInSelectionSort {
    public static int getInversions(int[] arr, int n){
        //Your code goes here

         int sum = 0;
        for(int i=0; i<n-1;i++){
            int smallest=arr[i];
            int smallestIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<smallest){
                    smallest=arr[j];
                    smallestIndex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[smallestIndex];
            arr[smallestIndex]=temp;
            sum = sum + smallestIndex - i;
        }
        return sum;
    }

}