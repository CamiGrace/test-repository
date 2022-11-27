import java.util.Scanner;


public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner DbScanner = new Scanner(System.in);
		System.out.println("Pick a number");
		int number = DbScanner.nextInt();
		if(number>3) {
			System.out.println("Hello");
		}
		
	}

}
