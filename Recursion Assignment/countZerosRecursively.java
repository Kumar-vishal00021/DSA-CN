
public class countZerosRecursively {

	public static int countZerosRec(int n){
		// Write your code here
		if(n == 0){
			return 1;
		}else if(n/10 == 0){
			return 0;
		}
		else {
			int smAns = 0;
			if(n%10 == 0){
				smAns++;
			}
			int bigAns =smAns + countZerosRec(n/10);
			return bigAns;
		}
	}
}
