import java.util.HashMap;

public class LongestSubArrayZeroSum {

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0; // Initialize sum to 0
        int maxLen = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Calculate the cumulative sum

            // If the sum is zero, the subarray from 0 to i has zero sum
            if (sum == 0) {
                maxLen = i + 1;
            }

            // If sum is already present in the map, we found a subarray with zero sum
            if (map.containsKey(sum)) {
                int len = i - map.get(sum); // Calculate the length of the subarray
                maxLen = Math.max(maxLen, len); // Update maxLen if needed
            } else {
                // Store the sum with the current index
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
