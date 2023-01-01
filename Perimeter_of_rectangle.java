package Question8;
import java.util.Scanner;

public class Perimeter_of_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER VALUE OF EDGES");
		float a = in.nextFloat();
		float b = in.nextFloat();
		float perimeter;
		perimeter = 2*(a+b);
		System.out.println("PERIMETER OF RECTANGLE IS:" +perimeter);
		
		
	}

}
