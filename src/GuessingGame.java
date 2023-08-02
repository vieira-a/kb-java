import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner readGuessNumber = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int totalAttempts = 0;
        int totalPoints = 1000;

        for (int i = 0; i < 5; i++) {
            System.out.println("Type a number maximum value 100: ");
            int guessNumber = readGuessNumber.nextInt();
            totalAttempts++;
            totalPoints = (totalPoints - 200);
            System.out.println("Remaining attempts: "+ (5 - totalAttempts));

            if (guessNumber == randomNumber) {
                System.out.println("You win! Random number: "+ randomNumber);
                System.out.println("Total points: "+ (totalPoints + 200));
                break;

            } else if (guessNumber > randomNumber) {
                System.out.println("Its high");

            } else {
                System.out.println("Its low");
            }

            if (totalAttempts == 5) {
                System.out.println("You lose! Random number: "+ randomNumber);
                break;
            }
        }
    }
}
