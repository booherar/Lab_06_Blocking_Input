import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String trash = "";
        double Celsius;
        double Fahrenheit;
    do {
        System.out.print("Enter a temperature in Celsius: ");
        if (scanner.hasNextDouble()) {
            Celsius = scanner.nextDouble();
            Fahrenheit = (Celsius * 9 / 5) + 32;
            System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.%n", Celsius, Fahrenheit);
        } else {
            trash = scanner.nextLine(); // Consume the invalid input
            System.out.println("Invalid input. Please enter a valid number for Celsius.");
        }
    } while (true);

    }
}
