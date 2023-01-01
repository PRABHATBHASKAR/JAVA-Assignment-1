package question6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         char ch;
         Scanner sc = new Scanner(System.in);
         sc.useDelimiter(" ");
         System.out.println("ENTER A CHARACTER");
         ch = sc.next().charAt(0);
         
         System.out.println("The ASCII value of "+ch+" is :" +(int)ch);
         
	}

}
