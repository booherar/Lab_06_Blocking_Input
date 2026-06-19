import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonGasTank;
        double mpg;
        double pricePerGallon;
        do {
            System.out.print("Enter the number of gallons of gas in the tank in gallons: ");
            if (scanner.hasNextDouble()) {
                gallonGasTank = scanner.nextDouble();
                System.out.print("Enter the miles per gallon (MPG) of the vehicle: ");
                if (scanner.hasNextDouble()) {
                    mpg = scanner.nextDouble();
                    System.out.print("Enter the price per gallon of gas: ");
                    if (scanner.hasNextDouble()) {
                        pricePerGallon = scanner.nextDouble();
                        double costToDrive = (100 / mpg) * pricePerGallon;
                        double distanceOnFullTank = gallonGasTank * mpg;
                        System.out.printf("The cost to drive 100 miles is $%.2f.%n", costToDrive);
                        System.out.printf("The distance the vehicle can travel on a full tank is %.2f miles.%n", distanceOnFullTank);
                    } else {
                        System.out.println("Invalid input for price per gallon. Please enter a valid number.");
                        scanner.nextLine(); // Consume the invalid input
                    }
                } else {
                    System.out.println("Invalid input for miles per gallon. Please enter a valid number.");
                    scanner.nextLine(); // Consume the invalid input
                }
            } else {
                System.out.println("Invalid input for size of gas tank. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
            }
        } while (true);
    }
}