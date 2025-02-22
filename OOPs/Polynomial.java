
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


  public class Polynomial {

    // Define a fixed size for the polynomial (Assume max degree is 100)
    private int[] coefficients;

    // Constructor to initialize the polynomial with size 101 (degree 0 to 100)
    public Polynomial() {
        coefficients = new int[101];  // Assuming degree can go from 0 to 100
    }

    /* This function sets coefficient for a particular degree value, 
     * if degree is not in the polynomial then corresponding term with specified degree and value is added.
     * If the degree is already present in the polynomial, the previous coefficient is replaced by the new coefficient value.
     */
    public void setCoefficient(int degree, int coeff) {
        if (degree >= 0 && degree < coefficients.length) {
            coefficients[degree] = coeff;
        }
    }

    // Prints all the terms (only terms with non-zero coefficients are to be printed) in increasing order of degree.
    public void print() {
        boolean firstTerm = true;  // To handle formatting of the first term
        for (int i = 0; i < coefficients.length; i++) {
            if (coefficients[i] != 0) {
                if (!firstTerm) {
                    System.out.print(" ");
                }
                if (coefficients[i] > 0 && i != 0) {
                    System.out.print(coefficients[i] + "x" + i);
                } else if (coefficients[i] < 0) {
                    System.out.print(coefficients[i] + "x" + i);
                } else if (i == 0) {
                    System.out.print(coefficients[i]);
                }
                firstTerm = false;
            }
        }
        System.out.println();
    }

    // Adds two polynomials and returns a new polynomial which has the result
    public Polynomial add(Polynomial p) {
        Polynomial result = new Polynomial();
        for (int i = 0; i < coefficients.length; i++) {
            result.setCoefficient(i, this.coefficients[i] + p.coefficients[i]);
        }
        return result;
    }

    // Subtracts two polynomials and returns a new polynomial which has the result
    public Polynomial subtract(Polynomial p) {
        Polynomial result = new Polynomial();
        for (int i = 0; i < coefficients.length; i++) {
            result.setCoefficient(i, this.coefficients[i] - p.coefficients[i]);
        }
        return result;
    }

    // Multiply two polynomials and returns a new polynomial which has the result
    public Polynomial multiply(Polynomial p) {
        Polynomial result = new Polynomial();
        for (int i = 0; i < coefficients.length; i++) {
            if (this.coefficients[i] != 0) {
                for (int j = 0; j < p.coefficients.length; j++) {
                    if (p.coefficients[j] != 0) {
                        result.setCoefficient(i + j, result.coefficients[i + j] + this.coefficients[i] * p.coefficients[j]);
                    }
                }
            }
        }
        return result;
    }
}