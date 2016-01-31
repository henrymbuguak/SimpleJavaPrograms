/*
 Author: Henry Mbugua Kiarie
 Date  : 31st, January, 2016
 Email : henrymbuguak@gmail.com
 */
public class KnowingOddandEvenNumber {

	public static void main(String[] args) {
		//we want create an array of ten numbers
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
		for (int i= 0; i<numbers.length; i++) {
			//we use modulus operator to check if number is Even or Odd
			if (numbers[i]%2 == 0)
				System.out.println(numbers[i] + " is even number.");
			else
				System.out.println(numbers[i] + " is odd number.");
		}

	}

}
