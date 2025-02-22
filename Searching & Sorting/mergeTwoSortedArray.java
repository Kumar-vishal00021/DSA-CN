

public class mergeTwoSortedArray {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int n = arr1.length;
        int m = arr2.length;
        int p = 0,p1 = 0,p2 = 0;
        int[] output = new int[n+m];
        while(p1 < n && p2 < m){
            if(arr1[p1] < arr2[p2]){
                output[p] = arr1[p1];
                p1++;
                p++;
            }else{
                output[p] = arr2[p2];
                p2++;
                p++;
            }
        }
        while(p1 < n){
            output[p] = arr1[p1];
            p++;
            p1++;
        }
        while(p2 < m){
            output[p] = arr2[p2];
            p2++;
            p++;
        }
        
        return output;
    }

}