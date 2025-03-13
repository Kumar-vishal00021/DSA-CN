import java.util.*;
public class maximumFrequencyNumber {

    public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(arr.length == 0) return 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0 ; i<arr.length; i++){
			if(map.containsKey(arr[i])){
				int count = map.get(arr[i]);
				map.put(arr[i],count+1);
			}else{
				map.put(arr[i],1);
			}
		}
		int maxNumber = arr[0];
		int maxFrequency =map.get(maxNumber);
		for(int i=0; i<arr.length; i++){
			if(maxFrequency < map.get(arr[i])){
				maxFrequency = map.get(arr[i]);
				maxNumber = arr[i];
			}
		}
		return maxNumber;
    }
}

