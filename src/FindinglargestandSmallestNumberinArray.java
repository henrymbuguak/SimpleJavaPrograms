/*
 Author : Henry Mbugua Kiarie
 Date   : 31st, January, 2016
 Email  : henrymbuguak@gmail.com
 */


public class FindinglargestandSmallestNumberinArray {

	public static void main(String[] args) {
		// Creating array of 10 numbers
		int numbers[] = new int[]{34,48,63,64,98,23,56,43,78,22};
		
		//assigning first element of an array to the largest and smallest
		
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for (int i=1; i < numbers.length; i++) {
			if(numbers[i] > largest)
				largest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}
		System.out.println("The Largest number is " + largest);
		System.out.println("The smallest number is " + smallest);

	}

}
