
import java.util.Scanner;

public class fact {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int smallAns = n;
        int bigAns = factorial(n-1);
        int finalAns = smallAns *bigAns;
        return finalAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of "+n +"is :"+result);
    }
}
