package base;
import java.util.Locale;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner inputwater = new Scanner(System.in);
		System.out.println("Have you watered the plant today?: ");
		String agua = inputwater.nextLine();
		Scanner inputSun = new Scanner(System.in);
		System.out.println("Is it close to a window?: ");
		String sol = inputSun.nextLine();
		System.out.println(sol.toLowerCase().equals("yes"));
		System.out.println(agua.toLowerCase().equals("yes"));

		if (agua.toLowerCase().equals("yes") && sol.toLowerCase().equals("yes")) {
			Plant myPlant = new Plant();
			myPlant.wateringInstructions(false, "lilac", "Arthur");
			myPlant.sunlightRequirements(true, "lilac", "Arthur");
		} else {
			Plant myPlant = new Plant();
			myPlant.wateringInstructions(false, "lilac", "Arthur");
			myPlant.sunlightRequirements(false, "lilac", "Arthur");
		}


	}
}
