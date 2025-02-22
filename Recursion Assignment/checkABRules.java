public class checkABRules {

    public static boolean checkAB(String s) {
        // Base case: empty string is valid
        if (s.isEmpty()) {
            return true;
        }

        // Rule 1: String must start with 'a'
        if (s.charAt(0) != 'a') {
            return false;
        }

        // Check the rest of the string based on the rules
        return checkABHelper(s, 0);
    }

    private static boolean checkABHelper(String s, int index) {
        // Base case: reached the end of the string
        if (index >= s.length()) {
            return true;
        }

        // Current character
        char currentChar = s.charAt(index);

        // Rule 2: 'a' must be followed by nothing, 'a', or "bb"
        if (currentChar == 'a') {
            // Check if the next character is valid
            if (index + 1 < s.length()) {
                char nextChar = s.charAt(index + 1);
                if (nextChar == 'a') {
                    // 'a' followed by 'a' → valid
                    return checkABHelper(s, index + 1);
                } else if (nextChar == 'b') {
                    // 'a' followed by 'b' → check if it's "bb"
                    if (index + 2 < s.length() && s.charAt(index + 2) == 'b') {
                        // 'a' followed by "bb" → valid
                        return checkABHelper(s, index + 3);
                    } else {
                        // 'a' followed by 'b' (not "bb") → invalid
                        return false;
                    }
                } else {
                    // Invalid character
                    return false;
                }
            } else {
                // 'a' followed by nothing → valid
                return true;
            }
        }

        // Rule 3: "bb" must be followed by nothing or 'a'
        if (currentChar == 'b') {
            // Check if the current and next character form "bb"
            if (index + 1 < s.length() && s.charAt(index + 1) == 'b') {
                // "bb" found → check what follows
                if (index + 2 < s.length()) {
                    char nextChar = s.charAt(index + 2);
                    if (nextChar == 'a') {
                        // "bb" followed by 'a' → valid
                        return checkABHelper(s, index + 3);
                    } else {
                        // "bb" followed by 'b' → invalid
                        return false;
                    }
                } else {
                    // "bb" followed by nothing → valid
                    return true;
                }
            } else {
                // 'b' not part of "bb" → invalid
                return false;
            }
        }

        // Invalid character
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkAB("abb"));       // Output: true
        System.out.println(checkAB("abababa"));   // Output: false
        System.out.println(checkAB("aabba"));     // Output: true
        System.out.println(checkAB("abbaa"));     // Output: true
        System.out.println(checkAB("abbaab"));    // Output: false
    }
}
