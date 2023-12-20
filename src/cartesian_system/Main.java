package cartesian_system;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the X cordinate");
		Double xCordinate = sc.nextDouble();
		
		System.out.println("Enter the Y cordinate:");
		Double yCordinate = sc.nextDouble();
		
		
		while (xCordinate != 0 && yCordinate != 0) {
			
			if (xCordinate > 0 && yCordinate > 0) {
				System.out.println("First Quadrant");
				System.out.println("Enter the X cordinate");
				xCordinate = sc.nextDouble();
				System.out.println("Enter the Y cordinate:");
				yCordinate = sc.nextDouble();
			}
			else if (xCordinate < 0 && yCordinate >0) {
				System.out.println("Second Quadrant");
				System.out.println("Enter the X cordinate");
				xCordinate = sc.nextDouble();
				System.out.println("Enter the Y cordinate:");
				yCordinate = sc.nextDouble();
			}
			else if (xCordinate < 0 && yCordinate < 0) {
				System.out.println("Third Quadrant");
				System.out.println("Enter the X cordinate");
				xCordinate = sc.nextDouble();
				System.out.println("Enter the Y cordinate:");
				yCordinate = sc.nextDouble();
			}
			else {
				System.out.println("Fourth Quadrant");
				System.out.println("Enter the X cordinate");
				xCordinate = sc.nextDouble();
				System.out.println("Enter the Y cordinate:");
				yCordinate = sc.nextDouble();
			}
		}
		
		
		sc.close();

	}

}
