/*
 Author: Henry Mbugua Kiarie
 Date  : 31st, January, 2016
 Email : henrymbuguak@gmail.com
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatingAreaofCircle {

	public static void main(String[] args) {
		int radius = 0;
		System.out.println("Please enter the radius of the circle");
		try {
			//getting the radius from the console
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			radius  = Integer.parseInt(br.readLine());
		}
		// if invalid value was entered
		catch (NumberFormatException ne) {
			System.out.println("Invalid radius value " + ne);
			System.exit(0);
		}
		catch (IOException ioe) {
			System.out.println("IO Error : " + ioe);
			System.exit(0);
		}
		double area = Math.PI * radius * radius;
		System.out.println("Area of the circle is " + area);

	}

}
