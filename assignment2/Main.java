package assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two floating Number");
		float a = in.nextFloat();
		float b = in.nextFloat();
		float multi;
		multi = (a*b);
		System.out.println("multiply of two floating number is" +multi);
		
	}

}
