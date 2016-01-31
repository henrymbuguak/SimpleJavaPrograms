/*
 Author : Henry Mbugua Kiarie
 Date   : 31st, January, 2016
 Email  : henrymbuguak@gmail.com
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatingAreaofRectangle {

	public static void main(String[] args) {
		int width = 0;
		int length = 0;
		try {
			//Reading the length from console
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the lenth of the rectangle.");
			length = Integer.parseInt(br.readLine());
			//Reading the width from the console
			System.out.println("Please enter the width of the rectangle.");
			width = Integer.parseInt(br.readLine());
			
		}
		// if invalid value is entered
		catch (NumberFormatException ne) {
			System.out.println("Invalid value " + ne);
			System.exit(0);
		}
		catch (IOException ioe) {
			System.out.println("IO Error : " + ioe);
			System.exit(0);
		}
		//Area of rectangle is given by Length * width
		int area = length * width;
		System.out.println("Area of the rectangle is " + area);

	}

}
