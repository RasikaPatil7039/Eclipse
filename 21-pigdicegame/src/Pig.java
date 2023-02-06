import java.util.Scanner;
import java.util.Random;

public class Pig {
	public static int turn;
	public static int turnScore;
	public static int totalScore = 0;

	public static void main(String[] args) {
		System.out.println("WELCOME");
		Dice();

	}

	public static void Dice() {
		System.out.println("CHOOSE");
		while (turn <= 10) {
			System.out.println("role or dice(r/h):");
			Scanner sc = new Scanner(System.in);
			char userChoice = sc.next().charAt(0);
			if (userChoice == 'r') {
				Random random = new Random();
				int diceRoll = random.nextInt(1, 6);
				turnScore += diceRoll;
				totalScore += diceRoll;
				System.out.println("Dice: " + diceRoll);
				if (totalScore >= 20) {

					System.out.println("You won..!");
					System.out.println("Your Total Score is: " + totalScore);
					System.out.println();
				}
				if (diceRoll == 1) {
					totalScore -= turnScore;
					System.out.println("Game over.........");
					System.out.println("Turn Score: 0");
					System.out.println("Total score: " + totalScore);
					turnScore = 0;
					turn++;
				}
				System.out.println();
			}
			if (userChoice == 'h') {
				System.out.println("Turn Score: " + turnScore);
				System.out.println("Total Score: " + totalScore);

				System.out.println("This is Turn" + turn);
				turnScore = 0;
				turn++;
			}
		}
	}
}
