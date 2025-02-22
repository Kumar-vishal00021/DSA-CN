
import java.util.* ;
import java.io.*; 

public class sqrtNSolution {

	public static int sqrtN(long N) { 
    // Handle corner case 
    if (N == 0 || N == 1) { return (int) N; } // Initialize variable 'low' and 'high' with lower and upper bound of answer
     long low = 2; long high = N; // To store mid of 'low' and 'high'
      long mid; // Loop while 'low' is less than 'high'
       while (low < high) { // Calculating 'mid' 
       mid = low + (high - low) / 2; /* * If square of 'mid' is less than 'N' update 'low' else update 'high' To avoid * overflow we have NOT used the condition as ('mid' * 'mid' <= N) */ 
       if (mid <= (N / mid)) { low = mid + 1; } else { high = mid; }
     } // Return 'low' - 1
      return (int) low - 1;
    }
}