
// asked in Zoho Corporation Limited
public class findSmallestDiff {
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.
        int min=Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                if(Math.abs(arr1[i]-arr2[j]) < min){
                    min = Math.abs(arr1[i]-arr2[j]);
                }
            }
        }
        return min;
    }
}