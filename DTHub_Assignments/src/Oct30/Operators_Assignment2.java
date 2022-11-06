package Oct30;

public class Operators_Assignment2 {

	// Output : (((((10*2)+2)-2)-2)/2) -> 9

	public int Add(int n1, int n2) {
		int addresult = n1 + n2;
		System.out.println("Add result is " + addresult);
		return addresult;
	}

	public int Sub(float n1, int n2) {
		int subresult = (int) (n1 - n2);
		System.out.println("Subtract result is: " + subresult);
		return subresult;
	}

	public int Multiply(int n1, int n2) {
		int multiplyresult = n1 * n2;
		System.out.println("Multiply result is: " + multiplyresult);
		return multiplyresult;
	}

	public int Divide(int n1, int n2) {
		int divideresult = n1 / n2;
		System.out.println("Divide result is: " + divideresult);
		return divideresult;
	}

	public static void main(String[] args) {

		Operators_Assignment1 assignment1 = new Operators_Assignment1();
		int multiplyresult = assignment1.Multiply(10, 2);
		int sumresult = assignment1.Add(multiplyresult, 2);
		int subresult1 = assignment1.Sub(sumresult, 2);
		int subresult2 = assignment1.Sub(subresult1, 2);
		assignment1.Divide(subresult2, 2);
	}

}
