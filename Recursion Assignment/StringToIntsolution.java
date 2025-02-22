
public class StringToIntsolution {
    public static int convertStringToIntHelper(String s,int high){
        if(high == 0){
            return s.charAt(high) - '0';
        }
        int sa = s.charAt(high) - '0';
        int ba = convertStringToIntHelper(s, high-1);
        return ba * 10 + sa;
    }
     public static int convertStringToInt(String s){
         // Write your code here
        return convertStringToIntHelper(s, s.length()-1);
     }
 }













//  public  class stringToInteger{
//     public static int stringToIntegerHelper(String s,int high){
//         if(high == 0){
//             return s.charAt(high) - '0';
//         }
//         int finalAns;
//         int sm = s.charAt(high) - '0';
//         int largeAns = stringToIntegerHelper(s, high-1);
//         finalAns = largeAns * 10 + sm;
//         return finalAns;
//     }
//     public static int stringToInt(String s){
//         return stringToIntegerHelper(s, s.length()-1);
//     }
//     public static void main(String[] args) {
//         String s = "12348932";
//         System.out.println(stringToInt(s));
//     }
//  }