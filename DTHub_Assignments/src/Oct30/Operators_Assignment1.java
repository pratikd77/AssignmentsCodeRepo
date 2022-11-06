package Oct30;

public class Operators_Assignment1 {

	// OUTPUT: ((((10+2)+2)-2)*2/2) -> 12

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
		System.out.println("Final result is: " + divideresult);
		return divideresult;
	}

	public static void main(String[] args) {

		Operators_Assignment1 assignment1 = new Operators_Assignment1();
		int sumresult1 = assignment1.Add(10, 2);
		int sumresult2 = assignment1.Add(sumresult1, 2);
		int subresult = assignment1.Sub(sumresult2, 2);
		int multiplyresult = assignment1.Multiply(subresult, 2);
		assignment1.Divide(multiplyresult, 2);

	}
}
