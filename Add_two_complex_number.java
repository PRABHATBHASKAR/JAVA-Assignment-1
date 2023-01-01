package question7;

import java.util.Scanner;

public class Add_two_complex_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1st complex number :");
		System.out.println("ENTER REAL PART");
		a=sc.nextFloat();
		System.out.println("ENTER IMAGINARY PART");
		b=sc.nextFloat();
		System.out.println("2nd complex number ;");
		System.out.println("ENTER REAL PART");
		c=sc.nextFloat();
		System.out.println("ENTER IMAGINARY PART");
		d=sc.nextFloat();
		System.out.println("SUM OF TWO COMPLEX NUMBER : "+(a+c)+"+ i"+(b+d));
		
		

	}

}
