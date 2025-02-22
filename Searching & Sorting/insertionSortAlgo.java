public class insertionSortAlgo {
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i = 1; i<size; i++){
            for(int j = i; j>=1 ; j-- ){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
}