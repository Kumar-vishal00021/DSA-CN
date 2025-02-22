import java.util.Arrays;

public class maximumProfitsolution {

	public static int maximumProfit(int a[]) {
		// Write your code here
		Arrays.sort(a);
		int m=0;
		int n = a.length;
		for(int i=0; i<n;i++){
			int appPrice = a[i];
			int subscriber = n-i;
			int profit = appPrice * subscriber;
			if(profit > m){
				m = profit;
			}
		}
		return m;
	}

}
