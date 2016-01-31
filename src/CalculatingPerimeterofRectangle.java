/*
 Author: Henry Mbugua Kiarie
 Date  : 30th, Janury, 2016
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatingPerimeterofRectangle {

	public static void main(String[] args) {
		int width = 0;
		int length = 0;
		
		try {
			// read the length from the console
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the length of the rectangle");
			length = Integer.parseInt(br.readLine());
			
			//read the width from the console
			System.out.println("Please enter width of the rectangle ");
			width = Integer.parseInt(br.readLine());
		}
		//if invalid value was entered
		catch (NumberFormatException ne) {
			System.out.println("You entered invalid value " + ne);
			System.exit(0);
		}
		catch (IOException ioe) {
			System.out.println("IO Error: "  + ioe);
			System.exit(0);
		}
		//perimeter of a rectangle is given by 2*(length+width)
		int perimeter = 2 * (length + width);
		System.out.println("Perimeter of the rectangle is : " + perimeter);

	}

}
