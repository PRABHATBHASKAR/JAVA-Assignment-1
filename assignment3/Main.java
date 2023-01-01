package assignment3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two Number");
		double dividend = in.nextDouble();
		double divisor = in.nextDouble();
		double quotient;
		quotient = dividend / divisor;
		double remainder;
		remainder = dividend % divisor;
		System.out.println("Quotient is" +quotient);
		System.out.println("Remainder is" +remainder);
		
	}

}
