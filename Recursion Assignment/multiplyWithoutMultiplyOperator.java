
public class multiplyWithoutMultiplyOperator {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if( m == 0 || n == 0){
			return 0;
		}else if(m == 1){
			return n;
		}else if(n == 1){
			return m;
		}
		int smAns = m;
		int bigAns = multiplyTwoIntegers(m, n-1);
		int fa = smAns + bigAns;
	    return fa;
	}
}
