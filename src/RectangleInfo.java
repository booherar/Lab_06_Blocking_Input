import java.util.Scanner;
import java.util.Random;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length;
        double width;
    do {
        System.out.print("Enter the length of the rectangle: ");
        if (scanner.hasNextDouble()) {
            length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                double area = length * width;
                double perimeter = 2 * (length + width);
                double diagonal = Math.sqrt((width * width) + (length * length));
                System.out.printf("The area of the rectangle is %.2f.%n", area);
                System.out.printf("The perimeter of the rectangle is %.2f.%n", perimeter);
                System.out.printf("The diagonal of the rectangle is %.2f.%n", diagonal);
            } else {
                System.out.println("Invalid input for width. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
            }
        } else {
            System.out.println("Invalid input for length. Please enter a valid number.");
            scanner.nextLine(); // Consume the invalid input
        }
    } while (true);
    }
}
