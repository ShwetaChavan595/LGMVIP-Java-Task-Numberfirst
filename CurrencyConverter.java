import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Define conversion rates
        double usdToInr = 74.0; // 1 USD to INR
        double usdToEuro = 0.85; // 1 USD to Euro
        double inrToEuro = 0.011; // 1 INR to Euro

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the input amount and currency
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the currency (USD, INR, or Euro): ");
        String currency = scanner.nextLine().toUpperCase();

        double convertedAmount = 0.0;

        // Perform the conversion based on the selected currency
        if (currency.equals("USD")) {
            convertedAmount = amount;
        } else if (currency.equals("INR")) {
            convertedAmount = amount * usdToInr;
        } else if (currency.equals("EURO")) {
            convertedAmount = amount * usdToEuro;
        } else {
            System.out.println("Invalid currency selection.");
            System.exit(1); // Exit the program
        }

        // Display the converted amount
        System.out.println("Converted amount: " + convertedAmount + " " + currency);

        // Close the scanner
        scanner.close();
    }
}
