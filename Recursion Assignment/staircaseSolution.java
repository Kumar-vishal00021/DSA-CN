

public class staircaseSolution {
	
		
    public static int staircase(int n){
       if(n == 0){
           return 1;
       }else if(n == 1){
           return 1;
       }else if(n == 2){
           return 2;
       }else if(n==3){
           return 4;
       }else{
           return staircase(n-1) + staircase(n - 2) + staircase(n - 3);
       }

   }
   
}