

public class sumOfDigit {
	public static int sumOfDigits(int input){
		// Write your code here
		if(input <= 9){
			return input;
		}
		int smAns = input % 10;
		int bigAns = sumOfDigits(input/10);
		int fa =  bigAns + smAns;
		return fa;
	}
}
