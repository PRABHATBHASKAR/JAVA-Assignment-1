package Question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers to be swapped");
		int a = in.nextInt();
		int b = in.nextInt();
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped value a =" +a);
		System.out.println("Swapped value b =" +b);
		

	}

}
