/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

 public class ComplexNumbers {
	// Complete this class
	int r;
	int i;
	ComplexNumbers(int r,int i){
		this.r = r;
		this.i = i;
	}
	void plus(ComplexNumbers c2){
		this.r = this.r+c2.r;
		this.i = this.i+c2.i;
	}
	void multiply(ComplexNumbers c2){
		int temp = this.r;
		this.r = this.r * c2.r - this.i*c2.i;
		this.i = temp*c2.i + this.i * c2.r;
	}
	void print(){
		System.out.println(this.r +" + i"+this.i);
	}
}
