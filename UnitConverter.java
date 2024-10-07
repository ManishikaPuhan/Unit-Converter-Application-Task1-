import java.util.InputMismatchException;
import java.util.Scanner;

public class UnitConverter {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        double value;
        try {
            value = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.next(); // Clear the invalid input
            return; // Exit the program or handle accordingly
        }

        System.out.println("Select source unit:");
        System.out.println("1. Centimeters");
        System.out.println("2. Meters");
        System.out.println("3. Grams");
        System.out.println("4. Kilograms");
        int source = scanner.nextInt();

        System.out.println("Select target unit:");
        System.out.println("1. Centimeters");
        System.out.println("2. Meters");
        System.out.println("3. Grams");
        System.out.println("4. Kilograms");
        int target = scanner.nextInt();

        @SuppressWarnings("unused")
        double result = convertUnits(value, source, target);

        scanner.close(); // Close the scanner when done
    }

    private static double convertUnits(double value, int source, int target) {
        // Conversion logic

        if (source == 1 && target == 2)
            return value / 100; // Centimeters to Meters
        if (source == 2 && target == 1)
            return value * 100; // Meters to Centimeters
        if (source == 3 && target == 4)
            return value / 1000; // Grams to Kilograms
        if (source == 4 && target == 3)
            return value * 1000; // Kilograms to Grams
        return value; // Return input value if no conversion
    }
}
