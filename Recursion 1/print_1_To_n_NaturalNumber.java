
public class print_1_To_n_NaturalNumber {

	public static void print(int n){
		//Write your code here
       if(n<=0 || n> 10000){
		   	   System.out.print(0);
				return;
	   }else if(n==1){
		   	   System.out.print(1+" ");
			   return;
	   }
	   print(n-1);
	   System.out.print(n+" ");
	}
}
