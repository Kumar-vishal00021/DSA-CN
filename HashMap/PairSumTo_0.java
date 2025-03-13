import java.util.*;

public class PairSumTo_0 {
	public static int PairSum(int[] arr, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i =0; i<size; i++){
			if(map.containsKey(arr[i])){
				int count = map.get(arr[i]);
				map.put(arr[i],count+1);
			}else{
				map.put(arr[i],1);
			}
		}
		int pair =0;
		Set<Integer> keys = map.keySet();
		for(int key:keys){
			if(map.containsKey(key*-1) && key >0){
				pair += map.get(key)*map.get(key*-1); 
			}
			if(key == 0){
				pair += (map.get(key)*(map.get(key) -1)) / 2;
			}
		}
		return pair;
	}
}