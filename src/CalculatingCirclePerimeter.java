/*
   Author: Henry Mbugua  Kiarie
   Date  : 30th, January, 2016
   Email : henrymbuguak@gmail.com
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatingCirclePerimeter {

	public static void main(String[] args) {
		int radius = 0;
		System.out.println("Please enter radius of the circle");
		try {
			//get the radius from the console
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			radius = Integer.parseInt(br.readLine());
		}
		// if invalid value entered
		catch (NumberFormatException ne) {
			System.out.println("Invalid radius value " + ne);
			System.exit(0);
		}
		catch (IOException ioe) {
			System.out.println("IO Error: " +ioe);
			System.exit(0);
		}
		//perimeter of a circle is given by (2*pi*r)
		double perimeter = 2*Math.PI*radius;
		System.out.println("Perimeter of circle is " + perimeter);

	}

}
