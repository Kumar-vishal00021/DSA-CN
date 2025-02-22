// asked in Microsoft,Amdocs
public class mergeSortSolution {

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int n1 =  mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i<n1; i++){
            left[i] = arr[l + i];
        }
        for(int i = 0; i<n2; i++){
            right[i] = arr[mid + 1 + i];
        }

        int i = 0,j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i ++;
            }else{
                arr[k] = right[j];
                j ++;
            }
            k ++;
        }
        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
