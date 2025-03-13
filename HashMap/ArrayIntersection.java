import java.util.*;
public class ArrayIntersection {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		HashMap<Integer,Integer> map1 = new HashMap<>();
		for(int i =0; i<arr1.length; i++){
			if(map1.containsKey(arr1[i])){
				int count = map1.get(arr1[i]);
				map1.put(arr1[i],count+1);
			}else{
				map1.put(arr1[i],1);
			}
		}
		
		Arrays.sort(arr2);
		for(int key : arr2){
			if(map1.containsKey(key) && map1.get(key)>0){
                System.out.print(key+" ");
				map1.put(key,map1.get(key)-1);
			}
		}
	}

}