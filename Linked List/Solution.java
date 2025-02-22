
// import java.util.Scanner;

// public class Solution {

//     // Helper function to compute LCM of two numbers.
//     private static int lcm(int a, int b) {
//         return a / gcd(a, b) * b;
//     }
    
//     // Helper function to compute GCD of two numbers.
//     private static int gcd(int a, int b) {
//         while (b != 0) {
//             int tmp = a % b;
//             a = b;
//             b = tmp;
//         }
//         return a;
//     }
    
//     // Compute LCM for a subset (mask) of targets.
//     // targets: array of target values.
//     // mask: bitmask representing which targets are in the subset.
//     private static int lcmForMask(int[] targets, int mask) {
//         int L = 1;
//         for (int j = 0; j < targets.length; j++) {
//             if ((mask & (1 << j)) != 0) {
//                 L = lcm(L, targets[j]);
//             }
//         }
//         return L;
//     }
    
//     public static int minOperations(int[] nums, int[] target) {
//         int m = target.length;
//         int fullMask = (1 << m) - 1;
//         // Use a sufficiently large number as infinity.
//         int INF = (int) 1e9;
        
//         // dp[mask] = minimum cost to cover targets represented by 'mask'
//         int[] dp = new int[1 << m];
//         for (int i = 0; i < (1 << m); i++) {
//             dp[i] = INF;
//         }
//         dp[0] = 0;
        
//         // Process each element in nums
//         for (int x : nums) {
//             // For this element, we want to consider all nonempty subsets S of targets.
//             // We'll store the cost for this element to cover S.
//             // There are at most 2^m - 1 subsets.
//             int[] costForSubset = new int[1 << m];
//             for (int mask = 1; mask < (1 << m); mask++) {
//                 int L = lcmForMask(target, mask);
//                 // Compute the smallest multiple of L that is >= x.
//                 int multiple = ((x + L - 1) / L) * L; // ceiling division multiplied by L.
//                 costForSubset[mask] = multiple - x;
//             }
            
//             // Now update our dp array using this element (we can use it at most once).
//             // We'll update in a new dp array to avoid reusing the same element twice.
//             int[] newDp = dp.clone();
//             for (int prevMask = 0; prevMask < (1 << m); prevMask++) {
//                 if (dp[prevMask] == INF) continue;
//                 // Try using this element to cover some subset S (nonempty)
//                 for (int sub = 1; sub < (1 << m); sub++) {
//                     int newMask = prevMask | sub;
//                     int candidate = dp[prevMask] + costForSubset[sub];
//                     if (candidate < newDp[newMask]) {
//                         newDp[newMask] = candidate;
//                     }
//                 }
//             }
//             dp = newDp;
//         }
        
//         return dp[fullMask];
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input the size of nums and target arrays
//         System.out.println("Enter the size of nums array:");
//         int n = sc.nextInt();
//         System.out.println("Enter the size of target array:");
//         int m = sc.nextInt();

//         // Input the elements of the nums array
//         int[] nums = new int[n];
//         System.out.println("Enter the elements of nums array:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         // Input the elements of the target array
//         int[] target = new int[m];
//         System.out.println("Enter the elements of target array:");
//         for (int i = 0; i < m; i++) {
//             target[i] = sc.nextInt();
//         }

//         // Call the function and display the result
//         int result = minOperations(nums, target);
//         System.out.println("The minimum number of operations required is: " + result);

//         sc.close();
//     }
// }

