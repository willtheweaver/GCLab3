import java.util.*;

public class SquareCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String answer = "y";
		System.out.println("Learn your squares and cubes!");
		while (answer.equalsIgnoreCase("y")) {

			System.out.println("Enter an Integer: ");

			int usernumber = sc.nextInt();

			for (int i1 = 1; i1 <= usernumber; i1++) {
				System.out.println(i1 + "Squared: " + Math.pow(i1, 2) + "Cubed " + Math.pow(i1, 3));
			}
			System.out.println("Would you like to continue(enter y/n)");
			answer = sc.next();
			answer = inputValidator(answer, sc);
		} // End of while loop
		System.out.println("System closing");
	}

	public static String inputValidator(String input, Scanner value) {

		while (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n"))) {
			System.out.println("Please enter valid input");
			input = value.nextLine();
		}

		return input;
		
	}
	

}
