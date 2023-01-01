package Qustion9;

import java.util.Scanner;

public class Surface_area_of_sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("RADIUS OF CIRCLE");
		int radius = in.nextInt();
		double pie = 3.14;
		double area_sphere = 4 * pie *(radius*radius);
		System.out.println("SURFACE AREA OF SPHERE =" +area_sphere);
		
	}

}
