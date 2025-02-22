import java.util.Arrays;

public class intersectionSolution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int p1 =0;
		int p2 = 0;
		while(p1 < arr1.length && p2 < arr2.length){
			if(arr1[p1] == arr2[p2]){
				System.out.print(arr1[p1]+" ");
				p1++;
				p2++;
			}else if(arr1[p1] < arr2[p2]){
				p1++;
			}else{
				p2++;
			}
		}
	}

}