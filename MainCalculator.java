//import the scanner 
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Declare variables to store input values, result, and operator
        double num1, num2, result;
        char operator;

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first value and store it in num1
        System.out.print("Input your first value: ");
        num1 = scanner.nextDouble();

        // Prompt user for the second value and store it in num2
        System.out.print("Input your second value: ");
        num2 = scanner.nextDouble();

        // Prompt user for the operator (+, -, *, /) and store it in the operator variable
        System.out.print("input an operand (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        // Use a switch statement to perform the appropriate operation based on the operator
        switch (operator) {
            // Addition operation
            case '+':
                result = num1 + num2;
                System.out.println("Answer: " + result);
                break;
            // Subtraction operation
            case '-':
                result = num1 - num2;
                System.out.println("Answer: " + result);
                break;
            // Multiplication operation
            case '*':
                result = num1 * num2;
                System.out.println("Answer: " + result);
                break;
            // Division operation
            case '/':
                // Check if num2 is not zero to avoid division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Answer: " + result);
                } else {
                    System.out.println("Error: Math Error.");
                }
                break;
            // Default case for invalid operator
            default:
                System.out.println("Error: Invalid operator");
                break;
        }
    }
}
