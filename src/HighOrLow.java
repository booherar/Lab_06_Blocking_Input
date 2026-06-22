import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = new Random().nextInt(10) + 1;
        int guess = 0;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess < val) {
                    System.out.println("Too low. Try again.");

                } else if (guess > val) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    break;
                }
                } else {
                System.out.println("Invalid input. Please enter a valid integer between 1 and 10.");
                scanner.nextLine(); // Consume the invalid input
            }
        } while (true);
    }
}
