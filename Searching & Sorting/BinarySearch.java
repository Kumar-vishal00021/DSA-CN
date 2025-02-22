// asked in Oracle,Paytm,Media.net,Adobe,Accenture,Infosys,Consleague,Celeb-AI,Josh Tecch,Kempston,
// MAQ Software,Nosh Tech,EPAm Systems,Touch Computng Tech,Carbynetch,HyreSnap
public class BinarySearch {
    public static int search(int []arr, int target) {
        // Write your code here.
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}