public class x_toThePower_n {

	public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		  if(n ==0){
			 return 1;
		 }
		 if(x == 0 ){
			 return 0;
		 }
		
		 int smallAns = x;
		 int bigAns = power(x, n-1);
		 int finalAns = smallAns*bigAns;
		 return finalAns;
	}
}