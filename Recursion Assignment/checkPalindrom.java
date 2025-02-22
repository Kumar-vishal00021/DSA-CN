
public class checkPalindrom {
    public static boolean isPalindromHelper(String s,int low,int high){
        boolean isPalindrom;
        if(low>high){
            return true;
        }else if(low==high){
            return true;
        }else if(s.charAt(low) == s.charAt(high)){
            isPalindrom = true;
        }else{
            return false;
        }
        isPalindrom = isPalindromHelper(s, low+1, high-1);
        return isPalindrom;
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return isPalindromHelper(str,0,str.length()-1);
    }
}
