/*
 Author : Henry Mbugua Kiarie
 Date   : 31st, January, 2016
 Email  : henrymbuguak@gmail.com
 */
public class FactorialofNUmber {

	public static void main(String[] args) {
		int number = 5;
		
		//For example, factorial of 4*3*2*1.
		
		int factorial = number;
		for (int i = (number - 1); i > 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a number is " + factorial);

	}

}
