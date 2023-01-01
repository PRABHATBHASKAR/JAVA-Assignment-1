package Qestion10;

import java.util.Scanner;

public class Calculate_compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER PRINCIPLE,RATE,TIME(IN YEAR)");
		double Principle = in.nextDouble();
		double Rate = in.nextDouble();
		double Time = in.nextDouble();
		double compound_intrest = Principle * (Math.pow((1 + Rate / 100), Time)) - Principle;
        
		System.out.println("The Compound intrest is ;" + compound_intrest);
		
	}

}
